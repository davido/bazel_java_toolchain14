load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "remote_java_tools_linux",
    urls = [
        "file:///home/davido/java_tools_java15.zip",
    ],
)

http_archive(
    name = "openjdk15_linux_archive",
    build_file_content = """
java_runtime(name = 'runtime', srcs =  glob(['**']), visibility = ['//visibility:public'])
exports_files(["WORKSPACE"], visibility = ["//visibility:public"])
""",
    strip_prefix = "zulu15.27.17-ca-jdk15.0.0-linux_x64",
    urls = ["https://cdn.azul.com/zulu/bin/zulu15.27.17-ca-jdk15.0.0-linux_x64.tar.gz"],
)

#http_archive(
#    name = "remote_java_tools_linux",
#    sha256 = "196128eadc68a55fb42a1f990c84ee816f5b29320a72fe542fcfc4206ac3978a",
#    urls = [
#        "https://mirror.bazel.build/bazel_java_tools/releases/javac14/v1.0/java_tools_javac14_linux-v1.0.zip",
#        "https://github.com/bazelbuild/java_tools/releases/download/javac14-v1.0/java_tools_javac14_linux-v1.0.zip",
#    ],
#)

http_archive(
    name = "remote_java_tools_windows",
    sha256 = "a6c69fd89b87fccc4c75203be6b407a1ca22cbdb54cffbd445f874281a933149",
    urls = [
        "https://mirror.bazel.build/bazel_java_tools/releases/javac14/v1.0/java_tools_javac14_windows-v1.0.zip",
        "https://github.com/bazelbuild/java_tools/releases/download/javac14-v1.0/java_tools_javac14_windows-v1.0.zip",
    ],
)

http_archive(
    name = "remote_java_tools_darwin",
    sha256 = "e20f002ceb3f3353d64c022e1f3400d8539ee56ffcfd4a6680d73d6a2cac938b",
    urls = [
        "https://mirror.bazel.build/bazel_java_tools/releases/javac14/v1.0/java_tools_javac14_darwin-v1.0.zip",
        "https://github.com/bazelbuild/java_tools/releases/download/javac14-v1.0/java_tools_javac14_darwin-v1.0.zip",
    ],
)

http_archive(
    name = "openjdk14_linux_archive",
    build_file_content = """
java_runtime(name = 'runtime', srcs =  glob(['**']), visibility = ['//visibility:public'])
exports_files(["WORKSPACE"], visibility = ["//visibility:public"])
""",
    sha256 = "7f4310a98ea0e52bacbec389012d859dbb51e759fe35a2cfebb11300271872d2",
    strip_prefix = "zulu14.29.23-ca-jdk14.0.2-linux_x64",
    urls = ["https://cdn.azul.com/zulu/bin/zulu14.29.23-ca-jdk14.0.2-linux_x64.tar.gz"],
)
