// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The time when the Group was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the Group was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * An extended description to help users determine the purpose of a Group.
     * Must not be longer than 4,096 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An extended description to help users determine the purpose of a Group.
     * Must not be longer than 4,096 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the Group.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the Group.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * EntityKey of the Group.
     * Structure is documented below.
     * 
     */
    @Import(name="groupKey")
    private @Nullable Output<GroupGroupKeyGetArgs> groupKey;

    /**
     * @return EntityKey of the Group.
     * Structure is documented below.
     * 
     */
    public Optional<Output<GroupGroupKeyGetArgs>> groupKey() {
        return Optional.ofNullable(this.groupKey);
    }

    /**
     * The initial configuration options for creating a Group.
     * See the
     * [API reference](https://cloud.google.com/identity/docs/reference/rest/v1beta1/groups/create#initialgroupconfig)
     * for possible values.
     * Default value is `EMPTY`.
     * Possible values are `INITIAL_GROUP_CONFIG_UNSPECIFIED`, `WITH_INITIAL_OWNER`, and `EMPTY`.
     * 
     */
    @Import(name="initialGroupConfig")
    private @Nullable Output<String> initialGroupConfig;

    /**
     * @return The initial configuration options for creating a Group.
     * See the
     * [API reference](https://cloud.google.com/identity/docs/reference/rest/v1beta1/groups/create#initialgroupconfig)
     * for possible values.
     * Default value is `EMPTY`.
     * Possible values are `INITIAL_GROUP_CONFIG_UNSPECIFIED`, `WITH_INITIAL_OWNER`, and `EMPTY`.
     * 
     */
    public Optional<Output<String>> initialGroupConfig() {
        return Optional.ofNullable(this.initialGroupConfig);
    }

    /**
     * The labels that apply to the Group.
     * Must not contain more than one entry. Must contain the entry
     * &#39;cloudidentity.googleapis.com/groups.discussion_forum&#39;: &#39;&#39; if the Group is a Google Group or
     * &#39;system/groups/external&#39;: &#39;&#39; if the Group is an external-identity-mapped group.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels that apply to the Group.
     * Must not contain more than one entry. Must contain the entry
     * &#39;cloudidentity.googleapis.com/groups.discussion_forum&#39;: &#39;&#39; if the Group is a Google Group or
     * &#39;system/groups/external&#39;: &#39;&#39; if the Group is an external-identity-mapped group.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Resource name of the Group in the format: groups/{group_id}, where group_id is the unique ID assigned to the Group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the Group in the format: groups/{group_id}, where group_id is the unique ID assigned to the Group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource name of the entity under which this Group resides in the
     * Cloud Identity resource hierarchy.
     * Must be of the form identitysources/{identity_source_id} for external-identity-mapped
     * groups or customers/{customer_id} for Google Groups.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The resource name of the entity under which this Group resides in the
     * Cloud Identity resource hierarchy.
     * Must be of the form identitysources/{identity_source_id} for external-identity-mapped
     * groups or customers/{customer_id} for Google Groups.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * The time when the Group was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time when the Group was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.displayName = $.displayName;
        this.groupKey = $.groupKey;
        this.initialGroupConfig = $.initialGroupConfig;
        this.labels = $.labels;
        this.name = $.name;
        this.parent = $.parent;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the Group was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the Group was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description An extended description to help users determine the purpose of a Group.
         * Must not be longer than 4,096 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An extended description to help users determine the purpose of a Group.
         * Must not be longer than 4,096 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the Group.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the Group.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param groupKey EntityKey of the Group.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder groupKey(@Nullable Output<GroupGroupKeyGetArgs> groupKey) {
            $.groupKey = groupKey;
            return this;
        }

        /**
         * @param groupKey EntityKey of the Group.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder groupKey(GroupGroupKeyGetArgs groupKey) {
            return groupKey(Output.of(groupKey));
        }

        /**
         * @param initialGroupConfig The initial configuration options for creating a Group.
         * See the
         * [API reference](https://cloud.google.com/identity/docs/reference/rest/v1beta1/groups/create#initialgroupconfig)
         * for possible values.
         * Default value is `EMPTY`.
         * Possible values are `INITIAL_GROUP_CONFIG_UNSPECIFIED`, `WITH_INITIAL_OWNER`, and `EMPTY`.
         * 
         * @return builder
         * 
         */
        public Builder initialGroupConfig(@Nullable Output<String> initialGroupConfig) {
            $.initialGroupConfig = initialGroupConfig;
            return this;
        }

        /**
         * @param initialGroupConfig The initial configuration options for creating a Group.
         * See the
         * [API reference](https://cloud.google.com/identity/docs/reference/rest/v1beta1/groups/create#initialgroupconfig)
         * for possible values.
         * Default value is `EMPTY`.
         * Possible values are `INITIAL_GROUP_CONFIG_UNSPECIFIED`, `WITH_INITIAL_OWNER`, and `EMPTY`.
         * 
         * @return builder
         * 
         */
        public Builder initialGroupConfig(String initialGroupConfig) {
            return initialGroupConfig(Output.of(initialGroupConfig));
        }

        /**
         * @param labels The labels that apply to the Group.
         * Must not contain more than one entry. Must contain the entry
         * &#39;cloudidentity.googleapis.com/groups.discussion_forum&#39;: &#39;&#39; if the Group is a Google Group or
         * &#39;system/groups/external&#39;: &#39;&#39; if the Group is an external-identity-mapped group.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels that apply to the Group.
         * Must not contain more than one entry. Must contain the entry
         * &#39;cloudidentity.googleapis.com/groups.discussion_forum&#39;: &#39;&#39; if the Group is a Google Group or
         * &#39;system/groups/external&#39;: &#39;&#39; if the Group is an external-identity-mapped group.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Resource name of the Group in the format: groups/{group_id}, where group_id is the unique ID assigned to the Group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the Group in the format: groups/{group_id}, where group_id is the unique ID assigned to the Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The resource name of the entity under which this Group resides in the
         * Cloud Identity resource hierarchy.
         * Must be of the form identitysources/{identity_source_id} for external-identity-mapped
         * groups or customers/{customer_id} for Google Groups.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The resource name of the entity under which this Group resides in the
         * Cloud Identity resource hierarchy.
         * Must be of the form identitysources/{identity_source_id} for external-identity-mapped
         * groups or customers/{customer_id} for Google Groups.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param updateTime The time when the Group was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time when the Group was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public GroupState build() {
            return $;
        }
    }

}
