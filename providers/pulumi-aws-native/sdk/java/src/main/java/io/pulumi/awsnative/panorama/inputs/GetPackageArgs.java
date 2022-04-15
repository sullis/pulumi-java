// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPackageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPackageArgs Empty = new GetPackageArgs();

    @Import(name="packageId", required=true)
      private final String packageId;

    public String packageId() {
        return this.packageId;
    }

    public GetPackageArgs(String packageId) {
        this.packageId = Objects.requireNonNull(packageId, "expected parameter 'packageId' to be non-null");
    }

    private GetPackageArgs() {
        this.packageId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String packageId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageId = defaults.packageId;
        }

        public Builder packageId(String packageId) {
            this.packageId = Objects.requireNonNull(packageId);
            return this;
        }        public GetPackageArgs build() {
            return new GetPackageArgs(packageId);
        }
    }
}
