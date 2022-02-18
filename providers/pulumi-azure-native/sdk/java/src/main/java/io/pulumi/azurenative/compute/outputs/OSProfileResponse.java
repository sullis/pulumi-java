// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.LinuxConfigurationResponse;
import io.pulumi.azurenative.compute.outputs.VaultSecretGroupResponse;
import io.pulumi.azurenative.compute.outputs.WindowsConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OSProfileResponse {
    /**
     * Specifies the password of the administrator account. <br><br> **Minimum-length (Windows):** 8 characters <br><br> **Minimum-length (Linux):** 6 characters <br><br> **Max-length (Windows):** 123 characters <br><br> **Max-length (Linux):** 72 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" <br><br> For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) <br><br> For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     * 
     */
    private final @Nullable String adminPassword;
    /**
     * Specifies the name of the administrator account. <br><br> This property cannot be updated after the VM is created. <br><br> **Windows-only restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1  character <br><br> **Max-length (Linux):** 64 characters <br><br> **Max-length (Windows):** 20 characters.
     * 
     */
    private final @Nullable String adminUsername;
    /**
     * Specifies whether extension operations should be allowed on the virtual machine. <br><br>This may only be set to False when no extensions are present on the virtual machine.
     * 
     */
    private final @Nullable Boolean allowExtensionOperations;
    /**
     * Specifies the host OS name of the virtual machine. <br><br> This name cannot be updated after the VM is created. <br><br> **Max-length (Windows):** 15 characters <br><br> **Max-length (Linux):** 64 characters. <br><br> For naming conventions and restrictions see [Azure infrastructure services implementation guidelines](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules).
     * 
     */
    private final @Nullable String computerName;
    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. <br><br> **Note: Do not pass any secrets or passwords in customData property** <br><br> This property cannot be updated after the VM is created. <br><br> customData is passed to the VM to be saved as a file, for more information see [Custom Data on Azure VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/) <br><br> For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
     * 
     */
    private final @Nullable String customData;
    /**
     * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
     * 
     */
    private final @Nullable LinuxConfigurationResponse linuxConfiguration;
    /**
     * Specifies whether the guest provision signal is required to infer provision success of the virtual machine.  **Note: This property is for private testing only, and all customers must not set the property to false.**
     * 
     */
    private final @Nullable Boolean requireGuestProvisionSignal;
    /**
     * Specifies set of certificates that should be installed onto the virtual machine. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    private final @Nullable List<VaultSecretGroupResponse> secrets;
    /**
     * Specifies Windows operating system settings on the virtual machine.
     * 
     */
    private final @Nullable WindowsConfigurationResponse windowsConfiguration;

    @OutputCustomType.Constructor({"adminPassword","adminUsername","allowExtensionOperations","computerName","customData","linuxConfiguration","requireGuestProvisionSignal","secrets","windowsConfiguration"})
    private OSProfileResponse(
        @Nullable String adminPassword,
        @Nullable String adminUsername,
        @Nullable Boolean allowExtensionOperations,
        @Nullable String computerName,
        @Nullable String customData,
        @Nullable LinuxConfigurationResponse linuxConfiguration,
        @Nullable Boolean requireGuestProvisionSignal,
        @Nullable List<VaultSecretGroupResponse> secrets,
        @Nullable WindowsConfigurationResponse windowsConfiguration) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.allowExtensionOperations = allowExtensionOperations;
        this.computerName = computerName;
        this.customData = customData;
        this.linuxConfiguration = linuxConfiguration;
        this.requireGuestProvisionSignal = requireGuestProvisionSignal;
        this.secrets = secrets;
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * Specifies the password of the administrator account. <br><br> **Minimum-length (Windows):** 8 characters <br><br> **Minimum-length (Linux):** 6 characters <br><br> **Max-length (Windows):** 123 characters <br><br> **Max-length (Linux):** 72 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" <br><br> For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) <br><br> For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     * 
     */
    public Optional<String> getAdminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    /**
     * Specifies the name of the administrator account. <br><br> This property cannot be updated after the VM is created. <br><br> **Windows-only restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1  character <br><br> **Max-length (Linux):** 64 characters <br><br> **Max-length (Windows):** 20 characters.
     * 
     */
    public Optional<String> getAdminUsername() {
        return Optional.ofNullable(this.adminUsername);
    }
    /**
     * Specifies whether extension operations should be allowed on the virtual machine. <br><br>This may only be set to False when no extensions are present on the virtual machine.
     * 
     */
    public Optional<Boolean> getAllowExtensionOperations() {
        return Optional.ofNullable(this.allowExtensionOperations);
    }
    /**
     * Specifies the host OS name of the virtual machine. <br><br> This name cannot be updated after the VM is created. <br><br> **Max-length (Windows):** 15 characters <br><br> **Max-length (Linux):** 64 characters. <br><br> For naming conventions and restrictions see [Azure infrastructure services implementation guidelines](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules).
     * 
     */
    public Optional<String> getComputerName() {
        return Optional.ofNullable(this.computerName);
    }
    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. <br><br> **Note: Do not pass any secrets or passwords in customData property** <br><br> This property cannot be updated after the VM is created. <br><br> customData is passed to the VM to be saved as a file, for more information see [Custom Data on Azure VMs](https://azure.microsoft.com/blog/custom-data-and-cloud-init-on-windows-azure/) <br><br> For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
     * 
     */
    public Optional<String> getCustomData() {
        return Optional.ofNullable(this.customData);
    }
    /**
     * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
     * 
     */
    public Optional<LinuxConfigurationResponse> getLinuxConfiguration() {
        return Optional.ofNullable(this.linuxConfiguration);
    }
    /**
     * Specifies whether the guest provision signal is required to infer provision success of the virtual machine.  **Note: This property is for private testing only, and all customers must not set the property to false.**
     * 
     */
    public Optional<Boolean> getRequireGuestProvisionSignal() {
        return Optional.ofNullable(this.requireGuestProvisionSignal);
    }
    /**
     * Specifies set of certificates that should be installed onto the virtual machine. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    public List<VaultSecretGroupResponse> getSecrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }
    /**
     * Specifies Windows operating system settings on the virtual machine.
     * 
     */
    public Optional<WindowsConfigurationResponse> getWindowsConfiguration() {
        return Optional.ofNullable(this.windowsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPassword;
        private @Nullable String adminUsername;
        private @Nullable Boolean allowExtensionOperations;
        private @Nullable String computerName;
        private @Nullable String customData;
        private @Nullable LinuxConfigurationResponse linuxConfiguration;
        private @Nullable Boolean requireGuestProvisionSignal;
        private @Nullable List<VaultSecretGroupResponse> secrets;
        private @Nullable WindowsConfigurationResponse windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OSProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.allowExtensionOperations = defaults.allowExtensionOperations;
    	      this.computerName = defaults.computerName;
    	      this.customData = defaults.customData;
    	      this.linuxConfiguration = defaults.linuxConfiguration;
    	      this.requireGuestProvisionSignal = defaults.requireGuestProvisionSignal;
    	      this.secrets = defaults.secrets;
    	      this.windowsConfiguration = defaults.windowsConfiguration;
        }

        public Builder setAdminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminUsername(@Nullable String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder setAllowExtensionOperations(@Nullable Boolean allowExtensionOperations) {
            this.allowExtensionOperations = allowExtensionOperations;
            return this;
        }

        public Builder setComputerName(@Nullable String computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }

        public Builder setLinuxConfiguration(@Nullable LinuxConfigurationResponse linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            return this;
        }

        public Builder setRequireGuestProvisionSignal(@Nullable Boolean requireGuestProvisionSignal) {
            this.requireGuestProvisionSignal = requireGuestProvisionSignal;
            return this;
        }

        public Builder setSecrets(@Nullable List<VaultSecretGroupResponse> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setWindowsConfiguration(@Nullable WindowsConfigurationResponse windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }

        public OSProfileResponse build() {
            return new OSProfileResponse(adminPassword, adminUsername, allowExtensionOperations, computerName, customData, linuxConfiguration, requireGuestProvisionSignal, secrets, windowsConfiguration);
        }
    }
}
