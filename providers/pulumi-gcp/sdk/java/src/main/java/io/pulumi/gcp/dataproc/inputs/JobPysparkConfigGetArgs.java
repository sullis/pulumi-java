// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.JobPysparkConfigLoggingConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPysparkConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPysparkConfigGetArgs Empty = new JobPysparkConfigGetArgs();

    /**
     * HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
      private final @Nullable Output<List<String>> archiveUris;

    public Output<List<String>> getArchiveUris() {
        return this.archiveUris == null ? Output.empty() : this.archiveUris;
    }

    /**
     * The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * HCFS URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris")
      private final @Nullable Output<List<String>> fileUris;

    public Output<List<String>> getFileUris() {
        return this.fileUris == null ? Output.empty() : this.fileUris;
    }

    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @Import(name="jarFileUris")
      private final @Nullable Output<List<String>> jarFileUris;

    public Output<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Output.empty() : this.jarFileUris;
    }

    @Import(name="loggingConfig")
      private final @Nullable Output<JobPysparkConfigLoggingConfigGetArgs> loggingConfig;

    public Output<JobPysparkConfigLoggingConfigGetArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Output.empty() : this.loggingConfig;
    }

    /**
     * The HCFS URI of the main Python file to use as the driver. Must be a .py file.
     * 
     */
    @Import(name="mainPythonFileUri", required=true)
      private final Output<String> mainPythonFileUri;

    public Output<String> getMainPythonFileUri() {
        return this.mainPythonFileUri;
    }

    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
     * 
     */
    @Import(name="pythonFileUris")
      private final @Nullable Output<List<String>> pythonFileUris;

    public Output<List<String>> getPythonFileUris() {
        return this.pythonFileUris == null ? Output.empty() : this.pythonFileUris;
    }

    public JobPysparkConfigGetArgs(
        @Nullable Output<List<String>> archiveUris,
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> fileUris,
        @Nullable Output<List<String>> jarFileUris,
        @Nullable Output<JobPysparkConfigLoggingConfigGetArgs> loggingConfig,
        Output<String> mainPythonFileUri,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<List<String>> pythonFileUris) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri, "expected parameter 'mainPythonFileUri' to be non-null");
        this.properties = properties;
        this.pythonFileUris = pythonFileUris;
    }

    private JobPysparkConfigGetArgs() {
        this.archiveUris = Output.empty();
        this.args = Output.empty();
        this.fileUris = Output.empty();
        this.jarFileUris = Output.empty();
        this.loggingConfig = Output.empty();
        this.mainPythonFileUri = Output.empty();
        this.properties = Output.empty();
        this.pythonFileUris = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPysparkConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> archiveUris;
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> fileUris;
        private @Nullable Output<List<String>> jarFileUris;
        private @Nullable Output<JobPysparkConfigLoggingConfigGetArgs> loggingConfig;
        private Output<String> mainPythonFileUri;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<List<String>> pythonFileUris;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPysparkConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainPythonFileUri = defaults.mainPythonFileUri;
    	      this.properties = defaults.properties;
    	      this.pythonFileUris = defaults.pythonFileUris;
        }

        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }
        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = Output.ofNullable(archiveUris);
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable List<String> args) {
            this.args = Output.ofNullable(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            this.fileUris = fileUris;
            return this;
        }
        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = Output.ofNullable(fileUris);
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }
        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Output.ofNullable(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder loggingConfig(@Nullable Output<JobPysparkConfigLoggingConfigGetArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable JobPysparkConfigLoggingConfigGetArgs loggingConfig) {
            this.loggingConfig = Output.ofNullable(loggingConfig);
            return this;
        }
        public Builder mainPythonFileUri(Output<String> mainPythonFileUri) {
            this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
            return this;
        }
        public Builder mainPythonFileUri(String mainPythonFileUri) {
            this.mainPythonFileUri = Output.of(Objects.requireNonNull(mainPythonFileUri));
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder pythonFileUris(@Nullable Output<List<String>> pythonFileUris) {
            this.pythonFileUris = pythonFileUris;
            return this;
        }
        public Builder pythonFileUris(@Nullable List<String> pythonFileUris) {
            this.pythonFileUris = Output.ofNullable(pythonFileUris);
            return this;
        }
        public Builder pythonFileUris(String... pythonFileUris) {
            return pythonFileUris(List.of(pythonFileUris));
        }        public JobPysparkConfigGetArgs build() {
            return new JobPysparkConfigGetArgs(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainPythonFileUri, properties, pythonFileUris);
        }
    }
}
