// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WsfcDomainProfileResponse {
    /**
     * Account name used for creating cluster (at minimum needs permissions to 'Create Computer Objects' in domain).
     * 
     */
    private final @Nullable String clusterBootstrapAccount;
    /**
     * Account name used for operating cluster i.e. will be part of administrators group on all the participating virtual machines in the cluster.
     * 
     */
    private final @Nullable String clusterOperatorAccount;
    /**
     * Fully qualified name of the domain.
     * 
     */
    private final @Nullable String domainFqdn;
    /**
     * Optional path for fileshare witness.
     * 
     */
    private final @Nullable String fileShareWitnessPath;
    /**
     * Organizational Unit path in which the nodes and cluster will be present.
     * 
     */
    private final @Nullable String ouPath;
    /**
     * Account name under which SQL service will run on all participating SQL virtual machines in the cluster.
     * 
     */
    private final @Nullable String sqlServiceAccount;
    /**
     * Fully qualified ARM resource id of the witness storage account.
     * 
     */
    private final @Nullable String storageAccountUrl;

    @OutputCustomType.Constructor({"clusterBootstrapAccount","clusterOperatorAccount","domainFqdn","fileShareWitnessPath","ouPath","sqlServiceAccount","storageAccountUrl"})
    private WsfcDomainProfileResponse(
        @Nullable String clusterBootstrapAccount,
        @Nullable String clusterOperatorAccount,
        @Nullable String domainFqdn,
        @Nullable String fileShareWitnessPath,
        @Nullable String ouPath,
        @Nullable String sqlServiceAccount,
        @Nullable String storageAccountUrl) {
        this.clusterBootstrapAccount = clusterBootstrapAccount;
        this.clusterOperatorAccount = clusterOperatorAccount;
        this.domainFqdn = domainFqdn;
        this.fileShareWitnessPath = fileShareWitnessPath;
        this.ouPath = ouPath;
        this.sqlServiceAccount = sqlServiceAccount;
        this.storageAccountUrl = storageAccountUrl;
    }

    /**
     * Account name used for creating cluster (at minimum needs permissions to 'Create Computer Objects' in domain).
     * 
     */
    public Optional<String> getClusterBootstrapAccount() {
        return Optional.ofNullable(this.clusterBootstrapAccount);
    }
    /**
     * Account name used for operating cluster i.e. will be part of administrators group on all the participating virtual machines in the cluster.
     * 
     */
    public Optional<String> getClusterOperatorAccount() {
        return Optional.ofNullable(this.clusterOperatorAccount);
    }
    /**
     * Fully qualified name of the domain.
     * 
     */
    public Optional<String> getDomainFqdn() {
        return Optional.ofNullable(this.domainFqdn);
    }
    /**
     * Optional path for fileshare witness.
     * 
     */
    public Optional<String> getFileShareWitnessPath() {
        return Optional.ofNullable(this.fileShareWitnessPath);
    }
    /**
     * Organizational Unit path in which the nodes and cluster will be present.
     * 
     */
    public Optional<String> getOuPath() {
        return Optional.ofNullable(this.ouPath);
    }
    /**
     * Account name under which SQL service will run on all participating SQL virtual machines in the cluster.
     * 
     */
    public Optional<String> getSqlServiceAccount() {
        return Optional.ofNullable(this.sqlServiceAccount);
    }
    /**
     * Fully qualified ARM resource id of the witness storage account.
     * 
     */
    public Optional<String> getStorageAccountUrl() {
        return Optional.ofNullable(this.storageAccountUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsfcDomainProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterBootstrapAccount;
        private @Nullable String clusterOperatorAccount;
        private @Nullable String domainFqdn;
        private @Nullable String fileShareWitnessPath;
        private @Nullable String ouPath;
        private @Nullable String sqlServiceAccount;
        private @Nullable String storageAccountUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(WsfcDomainProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterBootstrapAccount = defaults.clusterBootstrapAccount;
    	      this.clusterOperatorAccount = defaults.clusterOperatorAccount;
    	      this.domainFqdn = defaults.domainFqdn;
    	      this.fileShareWitnessPath = defaults.fileShareWitnessPath;
    	      this.ouPath = defaults.ouPath;
    	      this.sqlServiceAccount = defaults.sqlServiceAccount;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
        }

        public Builder setClusterBootstrapAccount(@Nullable String clusterBootstrapAccount) {
            this.clusterBootstrapAccount = clusterBootstrapAccount;
            return this;
        }

        public Builder setClusterOperatorAccount(@Nullable String clusterOperatorAccount) {
            this.clusterOperatorAccount = clusterOperatorAccount;
            return this;
        }

        public Builder setDomainFqdn(@Nullable String domainFqdn) {
            this.domainFqdn = domainFqdn;
            return this;
        }

        public Builder setFileShareWitnessPath(@Nullable String fileShareWitnessPath) {
            this.fileShareWitnessPath = fileShareWitnessPath;
            return this;
        }

        public Builder setOuPath(@Nullable String ouPath) {
            this.ouPath = ouPath;
            return this;
        }

        public Builder setSqlServiceAccount(@Nullable String sqlServiceAccount) {
            this.sqlServiceAccount = sqlServiceAccount;
            return this;
        }

        public Builder setStorageAccountUrl(@Nullable String storageAccountUrl) {
            this.storageAccountUrl = storageAccountUrl;
            return this;
        }

        public WsfcDomainProfileResponse build() {
            return new WsfcDomainProfileResponse(clusterBootstrapAccount, clusterOperatorAccount, domainFqdn, fileShareWitnessPath, ouPath, sqlServiceAccount, storageAccountUrl);
        }
    }
}
