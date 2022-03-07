// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.VirtualMachineSshCredentialsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HDInsightResponseProperties {
    /**
     * Public IP address of the master node of the cluster.
     * 
     */
    private final @Nullable String address;
    /**
     * Admin credentials for master node of the cluster
     * 
     */
    private final @Nullable VirtualMachineSshCredentialsResponse administratorAccount;
    /**
     * Port open for ssh connections on the master node of the cluster.
     * 
     */
    private final @Nullable Integer sshPort;

    @OutputCustomType.Constructor({"address","administratorAccount","sshPort"})
    private HDInsightResponseProperties(
        @Nullable String address,
        @Nullable VirtualMachineSshCredentialsResponse administratorAccount,
        @Nullable Integer sshPort) {
        this.address = address;
        this.administratorAccount = administratorAccount;
        this.sshPort = sshPort;
    }

    /**
     * Public IP address of the master node of the cluster.
     * 
    */
    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    /**
     * Admin credentials for master node of the cluster
     * 
    */
    public Optional<VirtualMachineSshCredentialsResponse> getAdministratorAccount() {
        return Optional.ofNullable(this.administratorAccount);
    }
    /**
     * Port open for ssh connections on the master node of the cluster.
     * 
    */
    public Optional<Integer> getSshPort() {
        return Optional.ofNullable(this.sshPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable VirtualMachineSshCredentialsResponse administratorAccount;
        private @Nullable Integer sshPort;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.administratorAccount = defaults.administratorAccount;
    	      this.sshPort = defaults.sshPort;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setAdministratorAccount(@Nullable VirtualMachineSshCredentialsResponse administratorAccount) {
            this.administratorAccount = administratorAccount;
            return this;
        }

        public Builder setSshPort(@Nullable Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public HDInsightResponseProperties build() {
            return new HDInsightResponseProperties(address, administratorAccount, sshPort);
        }
    }
}