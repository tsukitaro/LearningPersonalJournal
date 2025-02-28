## characteristics of a good commit
## Atomic & Focused

 **Focused** it has to represent one and only one logical change, **Do not mix several independent changes in one commit**
``` git
# Good Commit
git commit -m "Add user authtentication"
# bad commit
git commit -m "Add user authentication and update UI styles"
```
## Descriptive Commit Message 

should clearly to explains what the commit does and why change was made. with enough context for other and my future self 
```git 
# Good commit message 
git commit -m "Fix Correct null pointer exception in user login" 
# ↑ is clearly and provide with the enough context
# Bad commit message
git commit -m "Fix bug" → this is bad
```
## Follow Convectional Commit Guidelines 
 use the standard commit guidelines to keep git history clean, consistent and easy to read
 we use the form type 
 - feat → ex
	```git 
	
	 git commit -m "feat(auth): add JWT-based authentication"
	```
 - fix
	```git 
	
	 git commit -m "fix(login): resolve reace condition in login flow"
	```
 - chore → updating grunt tasks etc; no production code change, will not be associated with a release type 
 - refactor docs → 
use guidelines like the angular commit guidelines 
use body to summary with imperative, present tense
with **change** NOT changed NOR changes, and motivation for the change

### footer 
should to use to closes issue or breaking changes 
close should listed on a separate line with "**Closes**" like this 
```
Closes #234
```
## Tested and Verified 
Make sure that the changes have been tested, and properly run
## Properly Scope 
when we are working on a specific feature or fixing a bug, ensure that all changes related to that task are included in a single commit
```
# Good commit with proper scope
git commit -m "refactor(auth): split auth logic into separate modul"
# Bad commit with mixed scope
git commit -m "refactor and minor fixes"
```
