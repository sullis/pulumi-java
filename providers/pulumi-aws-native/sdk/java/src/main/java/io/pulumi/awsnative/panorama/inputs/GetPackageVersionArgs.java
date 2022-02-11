// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPackageVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPackageVersionArgs Empty = new GetPackageVersionArgs();

    @InputImport(name="packageId", required=true)
    private final String packageId;

    public String getPackageId() {
        return this.packageId;
    }

    @InputImport(name="packageVersion", required=true)
    private final String packageVersion;

    public String getPackageVersion() {
        return this.packageVersion;
    }

    @InputImport(name="patchVersion", required=true)
    private final String patchVersion;

    public String getPatchVersion() {
        return this.patchVersion;
    }

    public GetPackageVersionArgs(
        String packageId,
        String packageVersion,
        String patchVersion) {
        this.packageId = Objects.requireNonNull(packageId, "expected parameter 'packageId' to be non-null");
        this.packageVersion = Objects.requireNonNull(packageVersion, "expected parameter 'packageVersion' to be non-null");
        this.patchVersion = Objects.requireNonNull(patchVersion, "expected parameter 'patchVersion' to be non-null");
    }

    private GetPackageVersionArgs() {
        this.packageId = null;
        this.packageVersion = null;
        this.patchVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackageVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String packageId;
        private String packageVersion;
        private String patchVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackageVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageId = defaults.packageId;
    	      this.packageVersion = defaults.packageVersion;
    	      this.patchVersion = defaults.patchVersion;
        }

        public Builder setPackageId(String packageId) {
            this.packageId = Objects.requireNonNull(packageId);
            return this;
        }

        public Builder setPackageVersion(String packageVersion) {
            this.packageVersion = Objects.requireNonNull(packageVersion);
            return this;
        }

        public Builder setPatchVersion(String patchVersion) {
            this.patchVersion = Objects.requireNonNull(patchVersion);
            return this;
        }

        public GetPackageVersionArgs build() {
            return new GetPackageVersionArgs(packageId, packageVersion, patchVersion);
        }
    }
}
