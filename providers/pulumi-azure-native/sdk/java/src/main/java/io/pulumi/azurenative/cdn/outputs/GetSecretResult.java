// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CustomerCertificateParametersResponse;
import io.pulumi.azurenative.cdn.outputs.ManagedCertificateParametersResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.azurenative.cdn.outputs.UrlSigningKeyParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSecretResult {
    private final String deploymentStatus;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * object which contains secret parameters
     * 
     */
    private final @Nullable Object parameters;
    /**
     * Provisioning status
     * 
     */
    private final String provisioningState;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"deploymentStatus","id","name","parameters","provisioningState","systemData","type"})
    private GetSecretResult(
        String deploymentStatus,
        String id,
        String name,
        @Nullable Object parameters,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * object which contains secret parameters
     * 
    */
    public Optional<Object> getParameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * Provisioning status
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentStatus;
        private String id;
        private String name;
        private @Nullable Object parameters;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDeploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Object parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSecretResult build() {
            return new GetSecretResult(deploymentStatus, id, name, parameters, provisioningState, systemData, type);
        }
    }
}