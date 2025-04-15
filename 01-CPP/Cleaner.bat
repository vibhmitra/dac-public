@echo off

rem Prompt for confirmation before deletion (Y/N)
echo This script will delete all .exe and .o files recursively in the current directory.
echo Are you sure you want to continue? (Y/N)
set /p confirm=

if /i "%confirm%"=="Y" (
  echo Deleting .exe and .o files recursively...
  del /s /q *.exe *.o
  echo Done!
) else (
  echo Deletion canceled.
)