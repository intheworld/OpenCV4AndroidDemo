
# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

add_library( # Sets the name of the library.
             detection_based_tracker

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/jni/DetectionBasedTracker_jni.cpp
)

set(distribution_DIR ${CMAKE_SOURCE_DIR}/../../../../distribution)

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

add_library(libopencv_calib3d STATIC IMPORTED)
set_target_properties(libopencv_calib3d PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_calib3d.a)

add_library(libopencv_core STATIC IMPORTED)
set_target_properties(libopencv_core PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_core.a)


add_library(libopencv_dnn STATIC IMPORTED)
set_target_properties(libopencv_dnn PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_dnn.a)


add_library(libopencv_features2d STATIC IMPORTED)
set_target_properties(libopencv_features2d PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_features2d.a)

add_library(libopencv_flann STATIC IMPORTED)
set_target_properties(libopencv_flann PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_flann.a)

add_library(libopencv_highgui STATIC IMPORTED)
set_target_properties(libopencv_highgui PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_highgui.a)

add_library(libopencv_imgcodecs STATIC IMPORTED)
set_target_properties(libopencv_imgcodecs PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_imgcodecs.a)

add_library(libopencv_imgproc STATIC IMPORTED)
set_target_properties(libopencv_imgproc PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_imgproc.a)

add_library(libopencv_ml STATIC IMPORTED)
set_target_properties(libopencv_ml PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_ml.a)

add_library(libopencv_objdetect STATIC IMPORTED)
set_target_properties(libopencv_objdetect PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_objdetect.a)

add_library(libopencv_photo STATIC IMPORTED)
set_target_properties(libopencv_photo PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_photo.a)

add_library(libopencv_shape STATIC IMPORTED)
set_target_properties(libopencv_shape PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_shape.a)

add_library(libopencv_stitching STATIC IMPORTED)
set_target_properties(libopencv_stitching PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_stitching.a)

add_library(libopencv_superres STATIC IMPORTED)
set_target_properties(libopencv_superres PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_superres.a)

add_library(libopencv_video STATIC IMPORTED)
set_target_properties(libopencv_video PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_video.a)

add_library(libopencv_videoio STATIC IMPORTED)
set_target_properties(libopencv_videoio PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_videoio.a)

add_library(libopencv_videostab STATIC IMPORTED)
set_target_properties(libopencv_videostab PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_videostab.a)


add_library(libopencv_java3 SHARED IMPORTED)
set_target_properties(libopencv_java3 PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libopencv_java3.so)


    ######################################
    #         3rd party library          #
    ######################################

add_library(libcpufeatures STATIC IMPORTED)
set_target_properties(libcpufeatures PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/libcpufeatures.a)

add_library(libIlmImf STATIC IMPORTED)
set_target_properties(libIlmImf PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/libIlmImf.a)

add_library(liblibjasper STATIC IMPORTED)
set_target_properties(liblibjasper PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/liblibjasper.a)

add_library(liblibjpeg STATIC IMPORTED)
set_target_properties(liblibjpeg PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/liblibjpeg.a)

add_library(liblibpng STATIC IMPORTED)
set_target_properties(liblibpng PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/liblibpng.a)

add_library(liblibprotobuf STATIC IMPORTED)
set_target_properties(liblibprotobuf PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/liblibprotobuf.a)

add_library(liblibtiff STATIC IMPORTED)
set_target_properties(liblibtiff PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/liblibtiff.a)

add_library(liblibwebp STATIC IMPORTED)
set_target_properties(liblibwebp PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/liblibwebp.a)

add_library(libtbb STATIC IMPORTED)
set_target_properties(libtbb PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/libtbb.a)

add_library(libtegra_hal STATIC IMPORTED)
set_target_properties(libtegra_hal PROPERTIES IMPORTED_LOCATION
    ${CMAKE_SOURCE_DIR}/3rdparty/libs/${ANDROID_ABI}/libtegra_hal.a)


# Specifies a path to native header files.
include_directories(
    ${CMAKE_SOURCE_DIR}/src/main/cpp/include)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -DANDROID_OS")

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( detection_based_tracker
                       log
                       android
                       libopencv_java3
                     )