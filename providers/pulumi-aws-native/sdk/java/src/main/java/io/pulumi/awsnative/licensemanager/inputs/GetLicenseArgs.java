// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLicenseArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLicenseArgs Empty = new GetLicenseArgs();

    /**
     * Amazon Resource Name is a unique name for each resource.
     * 
     */
    @InputImport(name="licenseArn", required=true)
    private final String licenseArn;

    public String getLicenseArn() {
        return this.licenseArn;
    }

    public GetLicenseArgs(String licenseArn) {
        this.licenseArn = Objects.requireNonNull(licenseArn, "expected parameter 'licenseArn' to be non-null");
    }

    private GetLicenseArgs() {
        this.licenseArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String licenseArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLicenseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenseArn = defaults.licenseArn;
        }

        public Builder setLicenseArn(String licenseArn) {
            this.licenseArn = Objects.requireNonNull(licenseArn);
            return this;
        }

        public GetLicenseArgs build() {
            return new GetLicenseArgs(licenseArn);
        }
    }
}
