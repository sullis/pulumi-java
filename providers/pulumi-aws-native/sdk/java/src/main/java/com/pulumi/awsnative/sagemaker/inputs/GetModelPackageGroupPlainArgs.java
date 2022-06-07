// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetModelPackageGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelPackageGroupPlainArgs Empty = new GetModelPackageGroupPlainArgs();

    @Import(name="modelPackageGroupArn", required=true)
    private String modelPackageGroupArn;

    public String modelPackageGroupArn() {
        return this.modelPackageGroupArn;
    }

    private GetModelPackageGroupPlainArgs() {}

    private GetModelPackageGroupPlainArgs(GetModelPackageGroupPlainArgs $) {
        this.modelPackageGroupArn = $.modelPackageGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelPackageGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelPackageGroupPlainArgs $;

        public Builder() {
            $ = new GetModelPackageGroupPlainArgs();
        }

        public Builder(GetModelPackageGroupPlainArgs defaults) {
            $ = new GetModelPackageGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder modelPackageGroupArn(String modelPackageGroupArn) {
            $.modelPackageGroupArn = modelPackageGroupArn;
            return this;
        }

        public GetModelPackageGroupPlainArgs build() {
            $.modelPackageGroupArn = Objects.requireNonNull($.modelPackageGroupArn, "expected parameter 'modelPackageGroupArn' to be non-null");
            return $;
        }
    }

}
