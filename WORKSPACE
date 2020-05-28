load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "remote_java_tools_linux",
    sha256 = "7abcbd244dd92270951592944a2efe9b4ce661123cc943b18b8f53ca78a3bc69",
    urls = [
        "https://github.com/davido/java_tools/releases/download/v14.0/java_tools_javac14_linux-v14.0.zip",
    ],
)

http_archive(
    name = "openjdk14_linux_archive",
    build_file_content = """
java_runtime(name = 'runtime', srcs =  glob(['**']), visibility = ['//visibility:public'])
exports_files(["WORKSPACE"], visibility = ["//visibility:public"])
""",
    sha256 = "48bb8947034cd079ad1ef83335e7634db4b12a26743a0dc314b6b861480777aa",
    strip_prefix = "zulu14.28.21-ca-jdk14.0.1-linux_x64",
    urls = ["https://cdn.azul.com/zulu/bin/zulu14.28.21-ca-jdk14.0.1-linux_x64.tar.gz"],
)
