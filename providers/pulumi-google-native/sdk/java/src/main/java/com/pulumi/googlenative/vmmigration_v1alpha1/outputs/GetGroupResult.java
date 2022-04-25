// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * @return The create time timestamp.
     * 
     */
    private final String createTime;
    /**
     * @return User-provided description of the group.
     * 
     */
    private final String description;
    /**
     * @return Display name is a user defined name for this group which can be updated.
     * 
     */
    private final String displayName;
    /**
     * @return The Group name.
     * 
     */
    private final String name;
    /**
     * @return The update time timestamp.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetGroupResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * @return The create time timestamp.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return User-provided description of the group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Display name is a user defined name for this group which can be updated.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The Group name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The update time timestamp.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetGroupResult build() {
            return new GetGroupResult(createTime, description, displayName, name, updateTime);
        }
    }
}
