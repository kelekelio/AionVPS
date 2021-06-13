# AionDB

![alt text](https://aionpowerbook.com/spring/spring_readme.jpg)

Heroku example: https://stark-mountain-03127.herokuapp.com/

Aion Database using Spring Boot.

Technologies used so far: Spring Boot, Thymeleaf, DataTables, Bootstrap

Done so far:
1. Multitenancy: Allowing to swicth between classic and live databased at runtime. Value stored as cookie. TODO: Create form to add ?server parameter to url witch radion buttn switch
2. Database l10n based localization support for the whole project. Allows #{STRING_NAME} to be used from any template.
3. GET APIs for items (ID), translations (NAME), and dungeons (full list). POST and DELETE APIs redundant. DB updated by external project.
5. Some item lists. TODO: add extra filters
6. Basic Dungeon list



SETUP:
1. List all suported servers in application.yml



REQUIRED:
1. Upload Aion Item icons to \src\main\resources\static\server\0\item\icon (for every supported server)
2. Uload Quest HTML files to P:\Coding\AionDB\src\main\resources\static\server\0\quest\* (for every language and supported server)
3. Upload skill icons to \src\main\resources\static\server\0\skill\icon (for every supported server)


APIs:
https://github.com/kelekelio/AionDB/wiki/API
