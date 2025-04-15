@echo off

rem Define destination directory (modify this path)
set "target_dir=\..\CDAC\Curriculum\2-Practice\WasteBin\CPP"

rem Prompt for confirmation before moving (Y/N)
echo This script will move all .exe and .o files to "%target_dir%".
echo Are you sure you want to continue? (Y/N)
set /p confirm=

if /i "%confirm%"=="Y" (
  echo Moving .exe and .o files...
  
  for /r %%a in (*.exe *.o) do move /y "%%a" "%target_dir%" 2>nul
  if errorlevel 1 (
    echo Error: Failed to move some files.
  )
  
  echo Done!
) else (
  echo Moving canceled.
)