#!/usr/bin/env zsh

# ruta al archivo
md_file="/home/keruto/Environments/ichiRepo/Roadmap.sh/projectsList.txt"

#ruta de monitoreo de los archivos
check_dir="/home/keruto/Environments/ichiRepo/Roadmap.sh/projects"

# archivo temporal para guardar el estado de las carpetas
state_file="/tmp/directories_state.txt"

# funcion para monitorear 
echo "Start here"
monitor-directories() {
  # initial_dirs=$(ls -d "$check_dir"/*(/))

  # compara la lista actual con la inicial
  # while true; do
    current_dirs=$(ls -d "$check_dir"/*(/))

    # valida el estdo del archivo
    if [[ ! -f "$state_file" ]]; then
      echo "$current_dirs" > "$state_file"
      echo "No se encontraron cambios. Estado inicial guardado"
      return 
    fi

    # lee la lista de carpetas guardas en el archivo de estado
    initial_dirs=$(cat "$state_file")
    
    new_dirs=$(comm -13 <(echo "$initial_dirs") <(echo "$current_dirs"))

    if [[ -n "$new_dirs" ]]; then
      for dir in $new_dirs; do
        dir_name=$(basename "$dir")
        echo "Detect new folder: $dir_name"

        # Agrega el nombre a de la nueva carpeta al archivo md
        echo "- $dir_name" >> "$md_file"
        echo "- $dir_name" >> "/home/keruto/Environments/ichiRepo/Roadmap.sh/README.md"
        echo "Project added to $md_file"
      done

    else 
      echo "No se detectaron nuevas carpetas"
      # actualiza la lista de carpetas para la proxima comparacion
      # initial_dirs=$current_dirs
    fi

    # actualiza el archivo de estado con la lista actual de carpetas 
    echo "$current_dirs" > "$state_file"

    # Esperar un poco antes de la siguiente interaccion
    # sleep 5
  # done

}

# Verifica si el directorio de monitoreo existe

if [[ ! -d "$check_dir" ]]; then
  echo "Path $check_dir not exits."
  exit 1
fi

# Ejecutar la funcion de monitoreo
monitor-directories
