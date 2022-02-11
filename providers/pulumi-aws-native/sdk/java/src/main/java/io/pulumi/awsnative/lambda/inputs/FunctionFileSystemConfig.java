// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FunctionFileSystemConfig extends io.pulumi.resources.InvokeArgs {

    public static final FunctionFileSystemConfig Empty = new FunctionFileSystemConfig();

    @InputImport(name="arn", required=true)
    private final String arn;

    public String getArn() {
        return this.arn;
    }

    @InputImport(name="localMountPath", required=true)
    private final String localMountPath;

    public String getLocalMountPath() {
        return this.localMountPath;
    }

    public FunctionFileSystemConfig(
        String arn,
        String localMountPath) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.localMountPath = Objects.requireNonNull(localMountPath, "expected parameter 'localMountPath' to be non-null");
    }

    private FunctionFileSystemConfig() {
        this.arn = null;
        this.localMountPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionFileSystemConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String localMountPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionFileSystemConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.localMountPath = defaults.localMountPath;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setLocalMountPath(String localMountPath) {
            this.localMountPath = Objects.requireNonNull(localMountPath);
            return this;
        }

        public FunctionFileSystemConfig build() {
            return new FunctionFileSystemConfig(arn, localMountPath);
        }
    }
}
