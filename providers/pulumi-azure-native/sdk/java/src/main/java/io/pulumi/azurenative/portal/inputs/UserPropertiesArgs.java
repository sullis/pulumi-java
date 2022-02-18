// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.enums.OsType;
import io.pulumi.azurenative.portal.enums.ShellType;
import io.pulumi.azurenative.portal.inputs.StorageProfileArgs;
import io.pulumi.azurenative.portal.inputs.TerminalSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The cloud shell user settings properties.
 * 
 */
public final class UserPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPropertiesArgs Empty = new UserPropertiesArgs();

    /**
     * The preferred location of the cloud shell.
     * 
     */
    @InputImport(name="preferredLocation", required=true)
    private final Input<String> preferredLocation;

    public Input<String> getPreferredLocation() {
        return this.preferredLocation;
    }

    /**
     * The operating system type of the cloud shell. Deprecated, use preferredShellType.
     * 
     */
    @InputImport(name="preferredOsType", required=true)
    private final Input<Either<String,OsType>> preferredOsType;

    public Input<Either<String,OsType>> getPreferredOsType() {
        return this.preferredOsType;
    }

    /**
     * The shell type of the cloud shell.
     * 
     */
    @InputImport(name="preferredShellType", required=true)
    private final Input<Either<String,ShellType>> preferredShellType;

    public Input<Either<String,ShellType>> getPreferredShellType() {
        return this.preferredShellType;
    }

    /**
     * The storage profile of the user settings.
     * 
     */
    @InputImport(name="storageProfile", required=true)
    private final Input<StorageProfileArgs> storageProfile;

    public Input<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile;
    }

    /**
     * Settings for terminal appearance.
     * 
     */
    @InputImport(name="terminalSettings", required=true)
    private final Input<TerminalSettingsArgs> terminalSettings;

    public Input<TerminalSettingsArgs> getTerminalSettings() {
        return this.terminalSettings;
    }

    public UserPropertiesArgs(
        Input<String> preferredLocation,
        Input<Either<String,OsType>> preferredOsType,
        Input<Either<String,ShellType>> preferredShellType,
        Input<StorageProfileArgs> storageProfile,
        Input<TerminalSettingsArgs> terminalSettings) {
        this.preferredLocation = Objects.requireNonNull(preferredLocation, "expected parameter 'preferredLocation' to be non-null");
        this.preferredOsType = Objects.requireNonNull(preferredOsType, "expected parameter 'preferredOsType' to be non-null");
        this.preferredShellType = Objects.requireNonNull(preferredShellType, "expected parameter 'preferredShellType' to be non-null");
        this.storageProfile = Objects.requireNonNull(storageProfile, "expected parameter 'storageProfile' to be non-null");
        this.terminalSettings = Objects.requireNonNull(terminalSettings, "expected parameter 'terminalSettings' to be non-null");
    }

    private UserPropertiesArgs() {
        this.preferredLocation = Input.empty();
        this.preferredOsType = Input.empty();
        this.preferredShellType = Input.empty();
        this.storageProfile = Input.empty();
        this.terminalSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> preferredLocation;
        private Input<Either<String,OsType>> preferredOsType;
        private Input<Either<String,ShellType>> preferredShellType;
        private Input<StorageProfileArgs> storageProfile;
        private Input<TerminalSettingsArgs> terminalSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredLocation = defaults.preferredLocation;
    	      this.preferredOsType = defaults.preferredOsType;
    	      this.preferredShellType = defaults.preferredShellType;
    	      this.storageProfile = defaults.storageProfile;
    	      this.terminalSettings = defaults.terminalSettings;
        }

        public Builder setPreferredLocation(Input<String> preferredLocation) {
            this.preferredLocation = Objects.requireNonNull(preferredLocation);
            return this;
        }

        public Builder setPreferredLocation(String preferredLocation) {
            this.preferredLocation = Input.of(Objects.requireNonNull(preferredLocation));
            return this;
        }

        public Builder setPreferredOsType(Input<Either<String,OsType>> preferredOsType) {
            this.preferredOsType = Objects.requireNonNull(preferredOsType);
            return this;
        }

        public Builder setPreferredOsType(Either<String,OsType> preferredOsType) {
            this.preferredOsType = Input.of(Objects.requireNonNull(preferredOsType));
            return this;
        }

        public Builder setPreferredShellType(Input<Either<String,ShellType>> preferredShellType) {
            this.preferredShellType = Objects.requireNonNull(preferredShellType);
            return this;
        }

        public Builder setPreferredShellType(Either<String,ShellType> preferredShellType) {
            this.preferredShellType = Input.of(Objects.requireNonNull(preferredShellType));
            return this;
        }

        public Builder setStorageProfile(Input<StorageProfileArgs> storageProfile) {
            this.storageProfile = Objects.requireNonNull(storageProfile);
            return this;
        }

        public Builder setStorageProfile(StorageProfileArgs storageProfile) {
            this.storageProfile = Input.of(Objects.requireNonNull(storageProfile));
            return this;
        }

        public Builder setTerminalSettings(Input<TerminalSettingsArgs> terminalSettings) {
            this.terminalSettings = Objects.requireNonNull(terminalSettings);
            return this;
        }

        public Builder setTerminalSettings(TerminalSettingsArgs terminalSettings) {
            this.terminalSettings = Input.of(Objects.requireNonNull(terminalSettings));
            return this;
        }

        public UserPropertiesArgs build() {
            return new UserPropertiesArgs(preferredLocation, preferredOsType, preferredShellType, storageProfile, terminalSettings);
        }
    }
}
