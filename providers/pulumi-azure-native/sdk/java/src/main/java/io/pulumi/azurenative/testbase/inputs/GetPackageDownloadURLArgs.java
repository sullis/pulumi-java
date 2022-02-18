// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPackageDownloadURLArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPackageDownloadURLArgs Empty = new GetPackageDownloadURLArgs();

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @InputImport(name="packageName", required=true)
    private final String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @InputImport(name="testBaseAccountName", required=true)
    private final String testBaseAccountName;

    public String getTestBaseAccountName() {
        return this.testBaseAccountName;
    }

    public GetPackageDownloadURLArgs(
        String packageName,
        String resourceGroupName,
        String testBaseAccountName) {
        this.packageName = Objects.requireNonNull(packageName, "expected parameter 'packageName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
    }

    private GetPackageDownloadURLArgs() {
        this.packageName = null;
        this.resourceGroupName = null;
        this.testBaseAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackageDownloadURLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String packageName;
        private String resourceGroupName;
        private String testBaseAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackageDownloadURLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageName = defaults.packageName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTestBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }

        public GetPackageDownloadURLArgs build() {
            return new GetPackageDownloadURLArgs(packageName, resourceGroupName, testBaseAccountName);
        }
    }
}
