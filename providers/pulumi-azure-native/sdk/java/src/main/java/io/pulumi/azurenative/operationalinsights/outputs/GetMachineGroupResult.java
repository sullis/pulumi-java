// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.azurenative.operationalinsights.outputs.MachineReferenceWithHintsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMachineGroupResult {
    /**
     * Count of machines in this group. The value of count may be bigger than the number of machines in case of the group has been truncated due to exceeding the max number of machines a group can handle.
     * 
     */
    private final @Nullable Integer count;
    /**
     * User defined name for the group
     * 
     */
    private final String displayName;
    /**
     * Resource ETAG.
     * 
     */
    private final @Nullable String etag;
    /**
     * Type of the machine group
     * 
     */
    private final @Nullable String groupType;
    /**
     * Resource identifier.
     * 
     */
    private final String id;
    /**
     * Additional resource type qualifier.
     * Expected value is 'machineGroup'.
     * 
     */
    private final String kind;
    /**
     * References of the machines in this group. The hints within each reference do not represent the current value of the corresponding fields. They are a snapshot created during the last time the machine group was updated.
     * 
     */
    private final @Nullable List<MachineReferenceWithHintsResponse> machines;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"count","displayName","etag","groupType","id","kind","machines","name","type"})
    private GetMachineGroupResult(
        @Nullable Integer count,
        String displayName,
        @Nullable String etag,
        @Nullable String groupType,
        String id,
        String kind,
        @Nullable List<MachineReferenceWithHintsResponse> machines,
        String name,
        String type) {
        this.count = count;
        this.displayName = Objects.requireNonNull(displayName);
        this.etag = etag;
        this.groupType = groupType;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.machines = machines;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Count of machines in this group. The value of count may be bigger than the number of machines in case of the group has been truncated due to exceeding the max number of machines a group can handle.
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * User defined name for the group
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource ETAG.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Type of the machine group
     * 
    */
    public Optional<String> getGroupType() {
        return Optional.ofNullable(this.groupType);
    }
    /**
     * Resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Additional resource type qualifier.
     * Expected value is 'machineGroup'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * References of the machines in this group. The hints within each reference do not represent the current value of the corresponding fields. They are a snapshot created during the last time the machine group was updated.
     * 
    */
    public List<MachineReferenceWithHintsResponse> getMachines() {
        return this.machines == null ? List.of() : this.machines;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
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

    public static Builder builder(GetMachineGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private String displayName;
        private @Nullable String etag;
        private @Nullable String groupType;
        private String id;
        private String kind;
        private @Nullable List<MachineReferenceWithHintsResponse> machines;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.groupType = defaults.groupType;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.machines = defaults.machines;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setGroupType(@Nullable String groupType) {
            this.groupType = groupType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMachines(@Nullable List<MachineReferenceWithHintsResponse> machines) {
            this.machines = machines;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetMachineGroupResult build() {
            return new GetMachineGroupResult(count, displayName, etag, groupType, id, kind, machines, name, type);
        }
    }
}