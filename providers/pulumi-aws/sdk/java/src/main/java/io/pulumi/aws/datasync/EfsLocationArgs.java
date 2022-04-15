// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync;

import io.pulumi.aws.datasync.inputs.EfsLocationEc2ConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EfsLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EfsLocationArgs Empty = new EfsLocationArgs();

    /**
     * Configuration block containing EC2 configurations for connecting to the EFS File System.
     * 
     */
    @Import(name="ec2Config", required=true)
      private final Output<EfsLocationEc2ConfigArgs> ec2Config;

    public Output<EfsLocationEc2ConfigArgs> ec2Config() {
        return this.ec2Config;
    }

    /**
     * Amazon Resource Name (ARN) of EFS File System.
     * 
     */
    @Import(name="efsFileSystemArn", required=true)
      private final Output<String> efsFileSystemArn;

    public Output<String> efsFileSystemArn() {
        return this.efsFileSystemArn;
    }

    /**
     * Subdirectory to perform actions as source or destination. Default `/`.
     * 
     */
    @Import(name="subdirectory")
      private final @Nullable Output<String> subdirectory;

    public Output<String> subdirectory() {
        return this.subdirectory == null ? Codegen.empty() : this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public EfsLocationArgs(
        Output<EfsLocationEc2ConfigArgs> ec2Config,
        Output<String> efsFileSystemArn,
        @Nullable Output<String> subdirectory,
        @Nullable Output<Map<String,String>> tags) {
        this.ec2Config = Objects.requireNonNull(ec2Config, "expected parameter 'ec2Config' to be non-null");
        this.efsFileSystemArn = Objects.requireNonNull(efsFileSystemArn, "expected parameter 'efsFileSystemArn' to be non-null");
        this.subdirectory = subdirectory;
        this.tags = tags;
    }

    private EfsLocationArgs() {
        this.ec2Config = Codegen.empty();
        this.efsFileSystemArn = Codegen.empty();
        this.subdirectory = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EfsLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<EfsLocationEc2ConfigArgs> ec2Config;
        private Output<String> efsFileSystemArn;
        private @Nullable Output<String> subdirectory;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EfsLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2Config = defaults.ec2Config;
    	      this.efsFileSystemArn = defaults.efsFileSystemArn;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
        }

        public Builder ec2Config(Output<EfsLocationEc2ConfigArgs> ec2Config) {
            this.ec2Config = Objects.requireNonNull(ec2Config);
            return this;
        }
        public Builder ec2Config(EfsLocationEc2ConfigArgs ec2Config) {
            this.ec2Config = Output.of(Objects.requireNonNull(ec2Config));
            return this;
        }
        public Builder efsFileSystemArn(Output<String> efsFileSystemArn) {
            this.efsFileSystemArn = Objects.requireNonNull(efsFileSystemArn);
            return this;
        }
        public Builder efsFileSystemArn(String efsFileSystemArn) {
            this.efsFileSystemArn = Output.of(Objects.requireNonNull(efsFileSystemArn));
            return this;
        }
        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }
        public Builder subdirectory(@Nullable String subdirectory) {
            this.subdirectory = Codegen.ofNullable(subdirectory);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public EfsLocationArgs build() {
            return new EfsLocationArgs(ec2Config, efsFileSystemArn, subdirectory, tags);
        }
    }
}
