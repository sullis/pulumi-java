// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of SqlServerInstance.
 * 
 */
public final class SqlServerInstancePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlServerInstancePropertiesResponse Empty = new SqlServerInstancePropertiesResponse();

    /**
     * SQL Server collation.
     * 
     */
    @Import(name="collation")
      private final @Nullable String collation;

    public Optional<String> getCollation() {
        return this.collation == null ? Optional.empty() : Optional.ofNullable(this.collation);
    }

    /**
     * ARM Resource id of the container resource (Azure Arc for Servers).
     * 
     */
    @Import(name="containerResourceId", required=true)
      private final String containerResourceId;

    public String getContainerResourceId() {
        return this.containerResourceId;
    }

    /**
     * The time when the resource was created.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * SQL Server current version.
     * 
     */
    @Import(name="currentVersion")
      private final @Nullable String currentVersion;

    public Optional<String> getCurrentVersion() {
        return this.currentVersion == null ? Optional.empty() : Optional.ofNullable(this.currentVersion);
    }

    /**
     * SQL Server edition.
     * 
     */
    @Import(name="edition")
      private final @Nullable String edition;

    public Optional<String> getEdition() {
        return this.edition == null ? Optional.empty() : Optional.ofNullable(this.edition);
    }

    /**
     * SQL Server instance name.
     * 
     */
    @Import(name="instanceName")
      private final @Nullable String instanceName;

    public Optional<String> getInstanceName() {
        return this.instanceName == null ? Optional.empty() : Optional.ofNullable(this.instanceName);
    }

    /**
     * SQL Server license type.
     * 
     */
    @Import(name="licenseType")
      private final @Nullable String licenseType;

    public Optional<String> getLicenseType() {
        return this.licenseType == null ? Optional.empty() : Optional.ofNullable(this.licenseType);
    }

    /**
     * SQL Server update level.
     * 
     */
    @Import(name="patchLevel")
      private final @Nullable String patchLevel;

    public Optional<String> getPatchLevel() {
        return this.patchLevel == null ? Optional.empty() : Optional.ofNullable(this.patchLevel);
    }

    /**
     * SQL Server product ID.
     * 
     */
    @Import(name="productId")
      private final @Nullable String productId;

    public Optional<String> getProductId() {
        return this.productId == null ? Optional.empty() : Optional.ofNullable(this.productId);
    }

    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The cloud connectivity status.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * Dynamic TCP ports used by SQL Server.
     * 
     */
    @Import(name="tcpDynamicPorts")
      private final @Nullable String tcpDynamicPorts;

    public Optional<String> getTcpDynamicPorts() {
        return this.tcpDynamicPorts == null ? Optional.empty() : Optional.ofNullable(this.tcpDynamicPorts);
    }

    /**
     * Static TCP ports used by SQL Server.
     * 
     */
    @Import(name="tcpStaticPorts")
      private final @Nullable String tcpStaticPorts;

    public Optional<String> getTcpStaticPorts() {
        return this.tcpStaticPorts == null ? Optional.empty() : Optional.ofNullable(this.tcpStaticPorts);
    }

    /**
     * The number of logical processors used by the SQL Server instance.
     * 
     */
    @Import(name="vCore")
      private final @Nullable String vCore;

    public Optional<String> getVCore() {
        return this.vCore == null ? Optional.empty() : Optional.ofNullable(this.vCore);
    }

    /**
     * SQL Server version.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public SqlServerInstancePropertiesResponse(
        @Nullable String collation,
        String containerResourceId,
        String createTime,
        @Nullable String currentVersion,
        @Nullable String edition,
        @Nullable String instanceName,
        @Nullable String licenseType,
        @Nullable String patchLevel,
        @Nullable String productId,
        String provisioningState,
        String status,
        @Nullable String tcpDynamicPorts,
        @Nullable String tcpStaticPorts,
        @Nullable String vCore,
        @Nullable String version) {
        this.collation = collation;
        this.containerResourceId = Objects.requireNonNull(containerResourceId, "expected parameter 'containerResourceId' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.currentVersion = currentVersion;
        this.edition = edition;
        this.instanceName = instanceName;
        this.licenseType = licenseType;
        this.patchLevel = patchLevel;
        this.productId = productId;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.tcpDynamicPorts = tcpDynamicPorts;
        this.tcpStaticPorts = tcpStaticPorts;
        this.vCore = vCore;
        this.version = version;
    }

    private SqlServerInstancePropertiesResponse() {
        this.collation = null;
        this.containerResourceId = null;
        this.createTime = null;
        this.currentVersion = null;
        this.edition = null;
        this.instanceName = null;
        this.licenseType = null;
        this.patchLevel = null;
        this.productId = null;
        this.provisioningState = null;
        this.status = null;
        this.tcpDynamicPorts = null;
        this.tcpStaticPorts = null;
        this.vCore = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String collation;
        private String containerResourceId;
        private String createTime;
        private @Nullable String currentVersion;
        private @Nullable String edition;
        private @Nullable String instanceName;
        private @Nullable String licenseType;
        private @Nullable String patchLevel;
        private @Nullable String productId;
        private String provisioningState;
        private String status;
        private @Nullable String tcpDynamicPorts;
        private @Nullable String tcpStaticPorts;
        private @Nullable String vCore;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerInstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collation = defaults.collation;
    	      this.containerResourceId = defaults.containerResourceId;
    	      this.createTime = defaults.createTime;
    	      this.currentVersion = defaults.currentVersion;
    	      this.edition = defaults.edition;
    	      this.instanceName = defaults.instanceName;
    	      this.licenseType = defaults.licenseType;
    	      this.patchLevel = defaults.patchLevel;
    	      this.productId = defaults.productId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.tcpDynamicPorts = defaults.tcpDynamicPorts;
    	      this.tcpStaticPorts = defaults.tcpStaticPorts;
    	      this.vCore = defaults.vCore;
    	      this.version = defaults.version;
        }

        public Builder collation(@Nullable String collation) {
            this.collation = collation;
            return this;
        }
        public Builder containerResourceId(String containerResourceId) {
            this.containerResourceId = Objects.requireNonNull(containerResourceId);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder currentVersion(@Nullable String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Builder edition(@Nullable String edition) {
            this.edition = edition;
            return this;
        }
        public Builder instanceName(@Nullable String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder patchLevel(@Nullable String patchLevel) {
            this.patchLevel = patchLevel;
            return this;
        }
        public Builder productId(@Nullable String productId) {
            this.productId = productId;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tcpDynamicPorts(@Nullable String tcpDynamicPorts) {
            this.tcpDynamicPorts = tcpDynamicPorts;
            return this;
        }
        public Builder tcpStaticPorts(@Nullable String tcpStaticPorts) {
            this.tcpStaticPorts = tcpStaticPorts;
            return this;
        }
        public Builder vCore(@Nullable String vCore) {
            this.vCore = vCore;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public SqlServerInstancePropertiesResponse build() {
            return new SqlServerInstancePropertiesResponse(collation, containerResourceId, createTime, currentVersion, edition, instanceName, licenseType, patchLevel, productId, provisioningState, status, tcpDynamicPorts, tcpStaticPorts, vCore, version);
        }
    }
}
