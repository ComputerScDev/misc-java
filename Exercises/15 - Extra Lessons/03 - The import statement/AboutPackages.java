/**
* two classes with the same name can be used in the same program iff they are in two different packages.
* def: a package is a collection of classes and/or interfaces, errors, exceptions, annotations and enums.
*
* packages are used for: organizing, managing namespaces (each package is a namespace), resolving naming
* conflicts, enforcing access control (we can declare package members have package-only access), and
* distributing java classes (packages can be combined/compressed into a JAR file for distribution).
*
* package naming convention, example: if our website is 'website.com', our package is named:
* com.website.project1.subproject2", etc. the dots correspond to directory structure for storing class
* files. so com.website.project1.subproject2 is stored in ...\com\website\project1\subproject2.class.
* the dot doesnt mean 'sub-package', example: java.awt and java.awt.event are two different packages
* java.awt is in ...\java\awt while java.awt.event is in ...java\awt\event.
*/

public class AboutPackages {
	
	public static void main(String[] args) {
		System.out.println("nothing here.");
	}
}
