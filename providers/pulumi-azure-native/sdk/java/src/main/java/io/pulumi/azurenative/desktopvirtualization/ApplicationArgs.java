// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.desktopvirtualization.enums.CommandLineSetting;
import io.pulumi.azurenative.desktopvirtualization.enums.RemoteApplicationType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The name of the application group
     * 
     */
    @InputImport(name="applicationGroupName", required=true)
    private final Input<String> applicationGroupName;

    public Input<String> getApplicationGroupName() {
        return this.applicationGroupName;
    }

    /**
     * The name of the application within the specified application group
     * 
     */
    @InputImport(name="applicationName")
    private final @Nullable Input<String> applicationName;

    public Input<String> getApplicationName() {
        return this.applicationName == null ? Input.empty() : this.applicationName;
    }

    /**
     * Resource Type of Application.
     * 
     */
    @InputImport(name="applicationType")
    private final @Nullable Input<Either<String,RemoteApplicationType>> applicationType;

    public Input<Either<String,RemoteApplicationType>> getApplicationType() {
        return this.applicationType == null ? Input.empty() : this.applicationType;
    }

    /**
     * Command Line Arguments for Application.
     * 
     */
    @InputImport(name="commandLineArguments")
    private final @Nullable Input<String> commandLineArguments;

    public Input<String> getCommandLineArguments() {
        return this.commandLineArguments == null ? Input.empty() : this.commandLineArguments;
    }

    /**
     * Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all.
     * 
     */
    @InputImport(name="commandLineSetting", required=true)
    private final Input<Either<String,CommandLineSetting>> commandLineSetting;

    public Input<Either<String,CommandLineSetting>> getCommandLineSetting() {
        return this.commandLineSetting;
    }

    /**
     * Description of Application.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies a path for the executable file for the application.
     * 
     */
    @InputImport(name="filePath")
    private final @Nullable Input<String> filePath;

    public Input<String> getFilePath() {
        return this.filePath == null ? Input.empty() : this.filePath;
    }

    /**
     * Friendly name of Application.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * Index of the icon.
     * 
     */
    @InputImport(name="iconIndex")
    private final @Nullable Input<Integer> iconIndex;

    public Input<Integer> getIconIndex() {
        return this.iconIndex == null ? Input.empty() : this.iconIndex;
    }

    /**
     * Path to icon.
     * 
     */
    @InputImport(name="iconPath")
    private final @Nullable Input<String> iconPath;

    public Input<String> getIconPath() {
        return this.iconPath == null ? Input.empty() : this.iconPath;
    }

    /**
     * Specifies the package application Id for MSIX applications
     * 
     */
    @InputImport(name="msixPackageApplicationId")
    private final @Nullable Input<String> msixPackageApplicationId;

    public Input<String> getMsixPackageApplicationId() {
        return this.msixPackageApplicationId == null ? Input.empty() : this.msixPackageApplicationId;
    }

    /**
     * Specifies the package family name for MSIX applications
     * 
     */
    @InputImport(name="msixPackageFamilyName")
    private final @Nullable Input<String> msixPackageFamilyName;

    public Input<String> getMsixPackageFamilyName() {
        return this.msixPackageFamilyName == null ? Input.empty() : this.msixPackageFamilyName;
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
     * Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     */
    @InputImport(name="showInPortal")
    private final @Nullable Input<Boolean> showInPortal;

    public Input<Boolean> getShowInPortal() {
        return this.showInPortal == null ? Input.empty() : this.showInPortal;
    }

    public ApplicationArgs(
        Input<String> applicationGroupName,
        @Nullable Input<String> applicationName,
        @Nullable Input<Either<String,RemoteApplicationType>> applicationType,
        @Nullable Input<String> commandLineArguments,
        Input<Either<String,CommandLineSetting>> commandLineSetting,
        @Nullable Input<String> description,
        @Nullable Input<String> filePath,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Integer> iconIndex,
        @Nullable Input<String> iconPath,
        @Nullable Input<String> msixPackageApplicationId,
        @Nullable Input<String> msixPackageFamilyName,
        Input<String> resourceGroupName,
        @Nullable Input<Boolean> showInPortal) {
        this.applicationGroupName = Objects.requireNonNull(applicationGroupName, "expected parameter 'applicationGroupName' to be non-null");
        this.applicationName = applicationName;
        this.applicationType = applicationType;
        this.commandLineArguments = commandLineArguments;
        this.commandLineSetting = Objects.requireNonNull(commandLineSetting, "expected parameter 'commandLineSetting' to be non-null");
        this.description = description;
        this.filePath = filePath;
        this.friendlyName = friendlyName;
        this.iconIndex = iconIndex;
        this.iconPath = iconPath;
        this.msixPackageApplicationId = msixPackageApplicationId;
        this.msixPackageFamilyName = msixPackageFamilyName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.showInPortal = showInPortal;
    }

    private ApplicationArgs() {
        this.applicationGroupName = Input.empty();
        this.applicationName = Input.empty();
        this.applicationType = Input.empty();
        this.commandLineArguments = Input.empty();
        this.commandLineSetting = Input.empty();
        this.description = Input.empty();
        this.filePath = Input.empty();
        this.friendlyName = Input.empty();
        this.iconIndex = Input.empty();
        this.iconPath = Input.empty();
        this.msixPackageApplicationId = Input.empty();
        this.msixPackageFamilyName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.showInPortal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> applicationGroupName;
        private @Nullable Input<String> applicationName;
        private @Nullable Input<Either<String,RemoteApplicationType>> applicationType;
        private @Nullable Input<String> commandLineArguments;
        private Input<Either<String,CommandLineSetting>> commandLineSetting;
        private @Nullable Input<String> description;
        private @Nullable Input<String> filePath;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Integer> iconIndex;
        private @Nullable Input<String> iconPath;
        private @Nullable Input<String> msixPackageApplicationId;
        private @Nullable Input<String> msixPackageFamilyName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Boolean> showInPortal;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGroupName = defaults.applicationGroupName;
    	      this.applicationName = defaults.applicationName;
    	      this.applicationType = defaults.applicationType;
    	      this.commandLineArguments = defaults.commandLineArguments;
    	      this.commandLineSetting = defaults.commandLineSetting;
    	      this.description = defaults.description;
    	      this.filePath = defaults.filePath;
    	      this.friendlyName = defaults.friendlyName;
    	      this.iconIndex = defaults.iconIndex;
    	      this.iconPath = defaults.iconPath;
    	      this.msixPackageApplicationId = defaults.msixPackageApplicationId;
    	      this.msixPackageFamilyName = defaults.msixPackageFamilyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.showInPortal = defaults.showInPortal;
        }

        public Builder setApplicationGroupName(Input<String> applicationGroupName) {
            this.applicationGroupName = Objects.requireNonNull(applicationGroupName);
            return this;
        }

        public Builder setApplicationGroupName(String applicationGroupName) {
            this.applicationGroupName = Input.of(Objects.requireNonNull(applicationGroupName));
            return this;
        }

        public Builder setApplicationName(@Nullable Input<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder setApplicationName(@Nullable String applicationName) {
            this.applicationName = Input.ofNullable(applicationName);
            return this;
        }

        public Builder setApplicationType(@Nullable Input<Either<String,RemoteApplicationType>> applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        public Builder setApplicationType(@Nullable Either<String,RemoteApplicationType> applicationType) {
            this.applicationType = Input.ofNullable(applicationType);
            return this;
        }

        public Builder setCommandLineArguments(@Nullable Input<String> commandLineArguments) {
            this.commandLineArguments = commandLineArguments;
            return this;
        }

        public Builder setCommandLineArguments(@Nullable String commandLineArguments) {
            this.commandLineArguments = Input.ofNullable(commandLineArguments);
            return this;
        }

        public Builder setCommandLineSetting(Input<Either<String,CommandLineSetting>> commandLineSetting) {
            this.commandLineSetting = Objects.requireNonNull(commandLineSetting);
            return this;
        }

        public Builder setCommandLineSetting(Either<String,CommandLineSetting> commandLineSetting) {
            this.commandLineSetting = Input.of(Objects.requireNonNull(commandLineSetting));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFilePath(@Nullable Input<String> filePath) {
            this.filePath = filePath;
            return this;
        }

        public Builder setFilePath(@Nullable String filePath) {
            this.filePath = Input.ofNullable(filePath);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setIconIndex(@Nullable Input<Integer> iconIndex) {
            this.iconIndex = iconIndex;
            return this;
        }

        public Builder setIconIndex(@Nullable Integer iconIndex) {
            this.iconIndex = Input.ofNullable(iconIndex);
            return this;
        }

        public Builder setIconPath(@Nullable Input<String> iconPath) {
            this.iconPath = iconPath;
            return this;
        }

        public Builder setIconPath(@Nullable String iconPath) {
            this.iconPath = Input.ofNullable(iconPath);
            return this;
        }

        public Builder setMsixPackageApplicationId(@Nullable Input<String> msixPackageApplicationId) {
            this.msixPackageApplicationId = msixPackageApplicationId;
            return this;
        }

        public Builder setMsixPackageApplicationId(@Nullable String msixPackageApplicationId) {
            this.msixPackageApplicationId = Input.ofNullable(msixPackageApplicationId);
            return this;
        }

        public Builder setMsixPackageFamilyName(@Nullable Input<String> msixPackageFamilyName) {
            this.msixPackageFamilyName = msixPackageFamilyName;
            return this;
        }

        public Builder setMsixPackageFamilyName(@Nullable String msixPackageFamilyName) {
            this.msixPackageFamilyName = Input.ofNullable(msixPackageFamilyName);
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

        public Builder setShowInPortal(@Nullable Input<Boolean> showInPortal) {
            this.showInPortal = showInPortal;
            return this;
        }

        public Builder setShowInPortal(@Nullable Boolean showInPortal) {
            this.showInPortal = Input.ofNullable(showInPortal);
            return this;
        }

        public ApplicationArgs build() {
            return new ApplicationArgs(applicationGroupName, applicationName, applicationType, commandLineArguments, commandLineSetting, description, filePath, friendlyName, iconIndex, iconPath, msixPackageApplicationId, msixPackageFamilyName, resourceGroupName, showInPortal);
        }
    }
}
