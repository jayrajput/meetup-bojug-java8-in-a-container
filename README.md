# Introduction
Code for BoJUG meeting showing pitfalls of running Java8 in a container

# Create the java8 and java10 image for the demo

All the commands are execute after changing to the ROOTDIR of the repository

    cd meetup-bojug-java8-in-a-container

Creating java10 image

    docker build -t java10 -f Dockerfile-10.0.2  .

Creating java8 image

    docker build -t java8 -f Dockerfile-8u131 .

You can update the Dockerfile with appropriate JDK version to test if they are
supporting Container properly or not.

# Running images with memory and cpu restrictions

Running java8 image. This will not print java.lang.OutOfMemoryError. The
invocation of OOM (out-of-memory) killer can be seen in system logs. Also the
number of CPUs will be seen as equal to the host's CPU and not 1. Basically not
working fine.

    docker run -i -t -m 40m --cpus=1 java8

Running java10 image will show java.lang.OutOfMemoryError. The number of CPUs
will be seen as 1. Basically working as fine.
    
    docker run -i -t -m 40m --cpus=1 java10
