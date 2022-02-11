// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class StorageLensAwsOrgArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensAwsOrgArgs Empty = new StorageLensAwsOrgArgs();

    @InputImport(name="arn", required=true)
    private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    public StorageLensAwsOrgArgs(Input<String> arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private StorageLensAwsOrgArgs() {
        this.arn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensAwsOrgArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensAwsOrgArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public StorageLensAwsOrgArgs build() {
            return new StorageLensAwsOrgArgs(arn);
        }
    }
}
