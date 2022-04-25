// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.outputs;

import com.pulumi.azurenative.automation.outputs.HybridRunbookWorkerLegacyResponse;
import com.pulumi.azurenative.automation.outputs.RunAsCredentialAssociationPropertyResponse;
import com.pulumi.azurenative.automation.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHybridRunbookWorkerGroupResult {
    /**
     * @return Sets the credential of a worker group.
     * 
     */
    private final @Nullable RunAsCredentialAssociationPropertyResponse credential;
    /**
     * @return Type of the HybridWorkerGroup.
     * 
     */
    private final @Nullable String groupType;
    /**
     * @return Gets or sets the list of hybrid runbook workers.
     * 
     */
    private final @Nullable List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers;
    /**
     * @return Gets or sets the id of the resource.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Gets or sets the name of the group.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Resource system metadata.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetHybridRunbookWorkerGroupResult(
        @CustomType.Parameter("credential") @Nullable RunAsCredentialAssociationPropertyResponse credential,
        @CustomType.Parameter("groupType") @Nullable String groupType,
        @CustomType.Parameter("hybridRunbookWorkers") @Nullable List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.credential = credential;
        this.groupType = groupType;
        this.hybridRunbookWorkers = hybridRunbookWorkers;
        this.id = id;
        this.name = name;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Sets the credential of a worker group.
     * 
     */
    public Optional<RunAsCredentialAssociationPropertyResponse> credential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * @return Type of the HybridWorkerGroup.
     * 
     */
    public Optional<String> groupType() {
        return Optional.ofNullable(this.groupType);
    }
    /**
     * @return Gets or sets the list of hybrid runbook workers.
     * 
     */
    public List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers() {
        return this.hybridRunbookWorkers == null ? List.of() : this.hybridRunbookWorkers;
    }
    /**
     * @return Gets or sets the id of the resource.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Gets or sets the name of the group.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Resource system metadata.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridRunbookWorkerGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RunAsCredentialAssociationPropertyResponse credential;
        private @Nullable String groupType;
        private @Nullable List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers;
        private @Nullable String id;
        private @Nullable String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridRunbookWorkerGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.groupType = defaults.groupType;
    	      this.hybridRunbookWorkers = defaults.hybridRunbookWorkers;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder credential(@Nullable RunAsCredentialAssociationPropertyResponse credential) {
            this.credential = credential;
            return this;
        }
        public Builder groupType(@Nullable String groupType) {
            this.groupType = groupType;
            return this;
        }
        public Builder hybridRunbookWorkers(@Nullable List<HybridRunbookWorkerLegacyResponse> hybridRunbookWorkers) {
            this.hybridRunbookWorkers = hybridRunbookWorkers;
            return this;
        }
        public Builder hybridRunbookWorkers(HybridRunbookWorkerLegacyResponse... hybridRunbookWorkers) {
            return hybridRunbookWorkers(List.of(hybridRunbookWorkers));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetHybridRunbookWorkerGroupResult build() {
            return new GetHybridRunbookWorkerGroupResult(credential, groupType, hybridRunbookWorkers, id, name, systemData, type);
        }
    }
}
