# MPS_CSharp
The C# language implementation in MPS

A new C# language plugin is now available - https://plugins.jetbrains.com/plugin/13402-csbaselanguage and should be preferred.

This project holds an MPS-specific definition of the C# language, which has been automatically imported from its grammar definition.
The https://github.com/premun/ingrid tool was used for the import and only minor manual polish was applied after the import.

The language has the structure, editor and textgen aspects fully defined and it is primarily meant to be used as a target language for code generation.

Further enhancements to the editor aspect are necessary before it can be used for any serious work. Enhancing the constraints, type-system and textgen would also be benefitial in order to make use of the language in MPS convenient, intuitive and properly assisted.
