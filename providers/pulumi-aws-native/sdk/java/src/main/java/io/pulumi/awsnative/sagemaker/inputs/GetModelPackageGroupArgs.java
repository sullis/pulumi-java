// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetModelPackageGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetModelPackageGroupArgs Empty = new GetModelPackageGroupArgs();

    @InputImport(name="modelPackageGroupArn", required=true)
    private final String modelPackageGroupArn;

    public String getModelPackageGroupArn() {
        return this.modelPackageGroupArn;
    }

    public GetModelPackageGroupArgs(String modelPackageGroupArn) {
        this.modelPackageGroupArn = Objects.requireNonNull(modelPackageGroupArn, "expected parameter 'modelPackageGroupArn' to be non-null");
    }

    private GetModelPackageGroupArgs() {
        this.modelPackageGroupArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelPackageGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String modelPackageGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelPackageGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelPackageGroupArn = defaults.modelPackageGroupArn;
        }

        public Builder setModelPackageGroupArn(String modelPackageGroupArn) {
            this.modelPackageGroupArn = Objects.requireNonNull(modelPackageGroupArn);
            return this;
        }

        public GetModelPackageGroupArgs build() {
            return new GetModelPackageGroupArgs(modelPackageGroupArn);
        }
    }
}
