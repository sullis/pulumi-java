// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetGroupResult {
    /**
     * A user-assigned name for this group, used only for display purposes.
     * 
     */
    private final String displayName;
    /**
     * The filter used to determine which monitored resources belong to this group.
     * 
     */
    private final String filter;
    /**
     * If true, the members of this group are considered to be a cluster. The system can perform additional analysis on groups that are clusters.
     * 
     */
    private final Boolean isCluster;
    /**
     * The name of this group. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] When creating a group, this field is ignored and a new name is created consisting of the project specified in the call to CreateGroup and a unique [GROUP_ID] that is generated automatically.
     * 
     */
    private final String name;
    /**
     * The name of the group's parent, if it has one. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] For groups with no parent, parent_name is the empty string, "".
     * 
     */
    private final String parentName;

    @OutputCustomType.Constructor({"displayName","filter","isCluster","name","parentName"})
    private GetGroupResult(
        String displayName,
        String filter,
        Boolean isCluster,
        String name,
        String parentName) {
        this.displayName = Objects.requireNonNull(displayName);
        this.filter = Objects.requireNonNull(filter);
        this.isCluster = Objects.requireNonNull(isCluster);
        this.name = Objects.requireNonNull(name);
        this.parentName = Objects.requireNonNull(parentName);
    }

    /**
     * A user-assigned name for this group, used only for display purposes.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The filter used to determine which monitored resources belong to this group.
     * 
    */
    public String getFilter() {
        return this.filter;
    }
    /**
     * If true, the members of this group are considered to be a cluster. The system can perform additional analysis on groups that are clusters.
     * 
    */
    public Boolean getIsCluster() {
        return this.isCluster;
    }
    /**
     * The name of this group. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] When creating a group, this field is ignored and a new name is created consisting of the project specified in the call to CreateGroup and a unique [GROUP_ID] that is generated automatically.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the group's parent, if it has one. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] For groups with no parent, parent_name is the empty string, "".
     * 
    */
    public String getParentName() {
        return this.parentName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String filter;
        private Boolean isCluster;
        private String name;
        private String parentName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.filter = defaults.filter;
    	      this.isCluster = defaults.isCluster;
    	      this.name = defaults.name;
    	      this.parentName = defaults.parentName;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setIsCluster(Boolean isCluster) {
            this.isCluster = Objects.requireNonNull(isCluster);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParentName(String parentName) {
            this.parentName = Objects.requireNonNull(parentName);
            return this;
        }
        public GetGroupResult build() {
            return new GetGroupResult(displayName, filter, isCluster, name, parentName);
        }
    }
}