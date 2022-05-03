#!/bin/sh

jpackage --input "LOCATION_OF_JAR" \
	--type dmg \
	--app-version "1.100.2" \
	--description "Minima App Installer" \
	--name MinimaVijayApp \
	--dest "DESTINATION_FOLDER_TO_KEEP_DMG_FILE" \
	--vendor "Minima" \
	--icon "LOCATION_OF_ICON_FILE" \
	--main-jar minima.jar \
	--main-class org.minima.Minima \
	--mac-package-name "Minima App" \
	--verbose \
	--java-options '--enable-preview' \
	--arguments '-daemon' \
	--arguments '-data DATA_DIR_LOCATION' \
	--arguments 'MINIMA_RPCENABLE=true' \
	--mac-package-identifier 'minima-app' \
	--mac-package-name 'minima'