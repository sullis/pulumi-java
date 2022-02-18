// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.desktopvirtualization.inputs.MsixPackageApplicationsArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.MsixPackageDependenciesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MSIXPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final MSIXPackageArgs Empty = new MSIXPackageArgs();

    /**
     * User friendly Name to be displayed in the portal.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name of the host pool within the specified resource group
     * 
     */
    @InputImport(name="hostPoolName", required=true)
    private final Input<String> hostPoolName;

    public Input<String> getHostPoolName() {
        return this.hostPoolName;
    }

    /**
     * VHD/CIM image path on Network Share.
     * 
     */
    @InputImport(name="imagePath")
    private final @Nullable Input<String> imagePath;

    public Input<String> getImagePath() {
        return this.imagePath == null ? Input.empty() : this.imagePath;
    }

    /**
     * Make this version of the package the active one across the hostpool.
     * 
     */
    @InputImport(name="isActive")
    private final @Nullable Input<Boolean> isActive;

    public Input<Boolean> getIsActive() {
        return this.isActive == null ? Input.empty() : this.isActive;
    }

    /**
     * Specifies how to register Package in feed.
     * 
     */
    @InputImport(name="isRegularRegistration")
    private final @Nullable Input<Boolean> isRegularRegistration;

    public Input<Boolean> getIsRegularRegistration() {
        return this.isRegularRegistration == null ? Input.empty() : this.isRegularRegistration;
    }

    /**
     * Date Package was last updated, found in the appxmanifest.xml.
     * 
     */
    @InputImport(name="lastUpdated")
    private final @Nullable Input<String> lastUpdated;

    public Input<String> getLastUpdated() {
        return this.lastUpdated == null ? Input.empty() : this.lastUpdated;
    }

    /**
     * The version specific package full name of the MSIX package within specified hostpool
     * 
     */
    @InputImport(name="msixPackageFullName")
    private final @Nullable Input<String> msixPackageFullName;

    public Input<String> getMsixPackageFullName() {
        return this.msixPackageFullName == null ? Input.empty() : this.msixPackageFullName;
    }

    /**
     * List of package applications.
     * 
     */
    @InputImport(name="packageApplications")
    private final @Nullable Input<List<MsixPackageApplicationsArgs>> packageApplications;

    public Input<List<MsixPackageApplicationsArgs>> getPackageApplications() {
        return this.packageApplications == null ? Input.empty() : this.packageApplications;
    }

    /**
     * List of package dependencies.
     * 
     */
    @InputImport(name="packageDependencies")
    private final @Nullable Input<List<MsixPackageDependenciesArgs>> packageDependencies;

    public Input<List<MsixPackageDependenciesArgs>> getPackageDependencies() {
        return this.packageDependencies == null ? Input.empty() : this.packageDependencies;
    }

    /**
     * Package Family Name from appxmanifest.xml. Contains Package Name and Publisher name.
     * 
     */
    @InputImport(name="packageFamilyName")
    private final @Nullable Input<String> packageFamilyName;

    public Input<String> getPackageFamilyName() {
        return this.packageFamilyName == null ? Input.empty() : this.packageFamilyName;
    }

    /**
     * Package Name from appxmanifest.xml.
     * 
     */
    @InputImport(name="packageName")
    private final @Nullable Input<String> packageName;

    public Input<String> getPackageName() {
        return this.packageName == null ? Input.empty() : this.packageName;
    }

    /**
     * Relative Path to the package inside the image.
     * 
     */
    @InputImport(name="packageRelativePath")
    private final @Nullable Input<String> packageRelativePath;

    public Input<String> getPackageRelativePath() {
        return this.packageRelativePath == null ? Input.empty() : this.packageRelativePath;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Package Version found in the appxmanifest.xml.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public MSIXPackageArgs(
        @Nullable Input<String> displayName,
        Input<String> hostPoolName,
        @Nullable Input<String> imagePath,
        @Nullable Input<Boolean> isActive,
        @Nullable Input<Boolean> isRegularRegistration,
        @Nullable Input<String> lastUpdated,
        @Nullable Input<String> msixPackageFullName,
        @Nullable Input<List<MsixPackageApplicationsArgs>> packageApplications,
        @Nullable Input<List<MsixPackageDependenciesArgs>> packageDependencies,
        @Nullable Input<String> packageFamilyName,
        @Nullable Input<String> packageName,
        @Nullable Input<String> packageRelativePath,
        Input<String> resourceGroupName,
        @Nullable Input<String> version) {
        this.displayName = displayName;
        this.hostPoolName = Objects.requireNonNull(hostPoolName, "expected parameter 'hostPoolName' to be non-null");
        this.imagePath = imagePath;
        this.isActive = isActive;
        this.isRegularRegistration = isRegularRegistration;
        this.lastUpdated = lastUpdated;
        this.msixPackageFullName = msixPackageFullName;
        this.packageApplications = packageApplications;
        this.packageDependencies = packageDependencies;
        this.packageFamilyName = packageFamilyName;
        this.packageName = packageName;
        this.packageRelativePath = packageRelativePath;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.version = version;
    }

    private MSIXPackageArgs() {
        this.displayName = Input.empty();
        this.hostPoolName = Input.empty();
        this.imagePath = Input.empty();
        this.isActive = Input.empty();
        this.isRegularRegistration = Input.empty();
        this.lastUpdated = Input.empty();
        this.msixPackageFullName = Input.empty();
        this.packageApplications = Input.empty();
        this.packageDependencies = Input.empty();
        this.packageFamilyName = Input.empty();
        this.packageName = Input.empty();
        this.packageRelativePath = Input.empty();
        this.resourceGroupName = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MSIXPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private Input<String> hostPoolName;
        private @Nullable Input<String> imagePath;
        private @Nullable Input<Boolean> isActive;
        private @Nullable Input<Boolean> isRegularRegistration;
        private @Nullable Input<String> lastUpdated;
        private @Nullable Input<String> msixPackageFullName;
        private @Nullable Input<List<MsixPackageApplicationsArgs>> packageApplications;
        private @Nullable Input<List<MsixPackageDependenciesArgs>> packageDependencies;
        private @Nullable Input<String> packageFamilyName;
        private @Nullable Input<String> packageName;
        private @Nullable Input<String> packageRelativePath;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(MSIXPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.hostPoolName = defaults.hostPoolName;
    	      this.imagePath = defaults.imagePath;
    	      this.isActive = defaults.isActive;
    	      this.isRegularRegistration = defaults.isRegularRegistration;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.msixPackageFullName = defaults.msixPackageFullName;
    	      this.packageApplications = defaults.packageApplications;
    	      this.packageDependencies = defaults.packageDependencies;
    	      this.packageFamilyName = defaults.packageFamilyName;
    	      this.packageName = defaults.packageName;
    	      this.packageRelativePath = defaults.packageRelativePath;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.version = defaults.version;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setHostPoolName(Input<String> hostPoolName) {
            this.hostPoolName = Objects.requireNonNull(hostPoolName);
            return this;
        }

        public Builder setHostPoolName(String hostPoolName) {
            this.hostPoolName = Input.of(Objects.requireNonNull(hostPoolName));
            return this;
        }

        public Builder setImagePath(@Nullable Input<String> imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Builder setImagePath(@Nullable String imagePath) {
            this.imagePath = Input.ofNullable(imagePath);
            return this;
        }

        public Builder setIsActive(@Nullable Input<Boolean> isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setIsActive(@Nullable Boolean isActive) {
            this.isActive = Input.ofNullable(isActive);
            return this;
        }

        public Builder setIsRegularRegistration(@Nullable Input<Boolean> isRegularRegistration) {
            this.isRegularRegistration = isRegularRegistration;
            return this;
        }

        public Builder setIsRegularRegistration(@Nullable Boolean isRegularRegistration) {
            this.isRegularRegistration = Input.ofNullable(isRegularRegistration);
            return this;
        }

        public Builder setLastUpdated(@Nullable Input<String> lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Builder setLastUpdated(@Nullable String lastUpdated) {
            this.lastUpdated = Input.ofNullable(lastUpdated);
            return this;
        }

        public Builder setMsixPackageFullName(@Nullable Input<String> msixPackageFullName) {
            this.msixPackageFullName = msixPackageFullName;
            return this;
        }

        public Builder setMsixPackageFullName(@Nullable String msixPackageFullName) {
            this.msixPackageFullName = Input.ofNullable(msixPackageFullName);
            return this;
        }

        public Builder setPackageApplications(@Nullable Input<List<MsixPackageApplicationsArgs>> packageApplications) {
            this.packageApplications = packageApplications;
            return this;
        }

        public Builder setPackageApplications(@Nullable List<MsixPackageApplicationsArgs> packageApplications) {
            this.packageApplications = Input.ofNullable(packageApplications);
            return this;
        }

        public Builder setPackageDependencies(@Nullable Input<List<MsixPackageDependenciesArgs>> packageDependencies) {
            this.packageDependencies = packageDependencies;
            return this;
        }

        public Builder setPackageDependencies(@Nullable List<MsixPackageDependenciesArgs> packageDependencies) {
            this.packageDependencies = Input.ofNullable(packageDependencies);
            return this;
        }

        public Builder setPackageFamilyName(@Nullable Input<String> packageFamilyName) {
            this.packageFamilyName = packageFamilyName;
            return this;
        }

        public Builder setPackageFamilyName(@Nullable String packageFamilyName) {
            this.packageFamilyName = Input.ofNullable(packageFamilyName);
            return this;
        }

        public Builder setPackageName(@Nullable Input<String> packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder setPackageName(@Nullable String packageName) {
            this.packageName = Input.ofNullable(packageName);
            return this;
        }

        public Builder setPackageRelativePath(@Nullable Input<String> packageRelativePath) {
            this.packageRelativePath = packageRelativePath;
            return this;
        }

        public Builder setPackageRelativePath(@Nullable String packageRelativePath) {
            this.packageRelativePath = Input.ofNullable(packageRelativePath);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public MSIXPackageArgs build() {
            return new MSIXPackageArgs(displayName, hostPoolName, imagePath, isActive, isRegularRegistration, lastUpdated, msixPackageFullName, packageApplications, packageDependencies, packageFamilyName, packageName, packageRelativePath, resourceGroupName, version);
        }
    }
}
