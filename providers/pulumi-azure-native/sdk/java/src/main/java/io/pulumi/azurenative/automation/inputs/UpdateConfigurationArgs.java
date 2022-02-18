// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.enums.OperatingSystemType;
import io.pulumi.azurenative.automation.inputs.LinuxPropertiesArgs;
import io.pulumi.azurenative.automation.inputs.TargetPropertiesArgs;
import io.pulumi.azurenative.automation.inputs.WindowsPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Update specific properties of the software update configuration.
 * 
 */
public final class UpdateConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpdateConfigurationArgs Empty = new UpdateConfigurationArgs();

    /**
     * List of azure resource Ids for azure virtual machines targeted by the software update configuration.
     * 
     */
    @InputImport(name="azureVirtualMachines")
    private final @Nullable Input<List<String>> azureVirtualMachines;

    public Input<List<String>> getAzureVirtualMachines() {
        return this.azureVirtualMachines == null ? Input.empty() : this.azureVirtualMachines;
    }

    /**
     * Maximum time allowed for the software update configuration run. Duration needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
     * 
     */
    @InputImport(name="duration")
    private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    /**
     * Linux specific update configuration.
     * 
     */
    @InputImport(name="linux")
    private final @Nullable Input<LinuxPropertiesArgs> linux;

    public Input<LinuxPropertiesArgs> getLinux() {
        return this.linux == null ? Input.empty() : this.linux;
    }

    /**
     * List of names of non-azure machines targeted by the software update configuration.
     * 
     */
    @InputImport(name="nonAzureComputerNames")
    private final @Nullable Input<List<String>> nonAzureComputerNames;

    public Input<List<String>> getNonAzureComputerNames() {
        return this.nonAzureComputerNames == null ? Input.empty() : this.nonAzureComputerNames;
    }

    /**
     * operating system of target machines
     * 
     */
    @InputImport(name="operatingSystem", required=true)
    private final Input<OperatingSystemType> operatingSystem;

    public Input<OperatingSystemType> getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Group targets for the software update configuration.
     * 
     */
    @InputImport(name="targets")
    private final @Nullable Input<TargetPropertiesArgs> targets;

    public Input<TargetPropertiesArgs> getTargets() {
        return this.targets == null ? Input.empty() : this.targets;
    }

    /**
     * Windows specific update configuration.
     * 
     */
    @InputImport(name="windows")
    private final @Nullable Input<WindowsPropertiesArgs> windows;

    public Input<WindowsPropertiesArgs> getWindows() {
        return this.windows == null ? Input.empty() : this.windows;
    }

    public UpdateConfigurationArgs(
        @Nullable Input<List<String>> azureVirtualMachines,
        @Nullable Input<String> duration,
        @Nullable Input<LinuxPropertiesArgs> linux,
        @Nullable Input<List<String>> nonAzureComputerNames,
        Input<OperatingSystemType> operatingSystem,
        @Nullable Input<TargetPropertiesArgs> targets,
        @Nullable Input<WindowsPropertiesArgs> windows) {
        this.azureVirtualMachines = azureVirtualMachines;
        this.duration = duration;
        this.linux = linux;
        this.nonAzureComputerNames = nonAzureComputerNames;
        this.operatingSystem = Objects.requireNonNull(operatingSystem, "expected parameter 'operatingSystem' to be non-null");
        this.targets = targets;
        this.windows = windows;
    }

    private UpdateConfigurationArgs() {
        this.azureVirtualMachines = Input.empty();
        this.duration = Input.empty();
        this.linux = Input.empty();
        this.nonAzureComputerNames = Input.empty();
        this.operatingSystem = Input.empty();
        this.targets = Input.empty();
        this.windows = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> azureVirtualMachines;
        private @Nullable Input<String> duration;
        private @Nullable Input<LinuxPropertiesArgs> linux;
        private @Nullable Input<List<String>> nonAzureComputerNames;
        private Input<OperatingSystemType> operatingSystem;
        private @Nullable Input<TargetPropertiesArgs> targets;
        private @Nullable Input<WindowsPropertiesArgs> windows;

        public Builder() {
    	      // Empty
        }

        public Builder(UpdateConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureVirtualMachines = defaults.azureVirtualMachines;
    	      this.duration = defaults.duration;
    	      this.linux = defaults.linux;
    	      this.nonAzureComputerNames = defaults.nonAzureComputerNames;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.targets = defaults.targets;
    	      this.windows = defaults.windows;
        }

        public Builder setAzureVirtualMachines(@Nullable Input<List<String>> azureVirtualMachines) {
            this.azureVirtualMachines = azureVirtualMachines;
            return this;
        }

        public Builder setAzureVirtualMachines(@Nullable List<String> azureVirtualMachines) {
            this.azureVirtualMachines = Input.ofNullable(azureVirtualMachines);
            return this;
        }

        public Builder setDuration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder setLinux(@Nullable Input<LinuxPropertiesArgs> linux) {
            this.linux = linux;
            return this;
        }

        public Builder setLinux(@Nullable LinuxPropertiesArgs linux) {
            this.linux = Input.ofNullable(linux);
            return this;
        }

        public Builder setNonAzureComputerNames(@Nullable Input<List<String>> nonAzureComputerNames) {
            this.nonAzureComputerNames = nonAzureComputerNames;
            return this;
        }

        public Builder setNonAzureComputerNames(@Nullable List<String> nonAzureComputerNames) {
            this.nonAzureComputerNames = Input.ofNullable(nonAzureComputerNames);
            return this;
        }

        public Builder setOperatingSystem(Input<OperatingSystemType> operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }

        public Builder setOperatingSystem(OperatingSystemType operatingSystem) {
            this.operatingSystem = Input.of(Objects.requireNonNull(operatingSystem));
            return this;
        }

        public Builder setTargets(@Nullable Input<TargetPropertiesArgs> targets) {
            this.targets = targets;
            return this;
        }

        public Builder setTargets(@Nullable TargetPropertiesArgs targets) {
            this.targets = Input.ofNullable(targets);
            return this;
        }

        public Builder setWindows(@Nullable Input<WindowsPropertiesArgs> windows) {
            this.windows = windows;
            return this;
        }

        public Builder setWindows(@Nullable WindowsPropertiesArgs windows) {
            this.windows = Input.ofNullable(windows);
            return this;
        }

        public UpdateConfigurationArgs build() {
            return new UpdateConfigurationArgs(azureVirtualMachines, duration, linux, nonAzureComputerNames, operatingSystem, targets, windows);
        }
    }
}
