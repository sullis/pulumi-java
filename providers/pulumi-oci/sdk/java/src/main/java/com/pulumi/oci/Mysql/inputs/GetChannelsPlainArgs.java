// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Mysql.inputs.GetChannelsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetChannelsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetChannelsPlainArgs Empty = new GetChannelsPlainArgs();

    /**
     * The OCID of the Channel.
     * 
     */
    @Import(name="channelId")
    private @Nullable String channelId;

    /**
     * @return The OCID of the Channel.
     * 
     */
    public Optional<String> channelId() {
        return Optional.ofNullable(this.channelId);
    }

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The DB System [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="dbSystemId")
    private @Nullable String dbSystemId;

    /**
     * @return The DB System [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<String> dbSystemId() {
        return Optional.ofNullable(this.dbSystemId);
    }

    /**
     * A filter to return only the resource matching the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only the resource matching the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetChannelsFilter> filters;

    public Optional<List<GetChannelsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * If true, returns only Channels that are enabled. If false, returns only Channels that are disabled.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Boolean isEnabled;

    /**
     * @return If true, returns only Channels that are enabled. If false, returns only Channels that are disabled.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * The LifecycleState of the Channel.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The LifecycleState of the Channel.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetChannelsPlainArgs() {}

    private GetChannelsPlainArgs(GetChannelsPlainArgs $) {
        this.channelId = $.channelId;
        this.compartmentId = $.compartmentId;
        this.dbSystemId = $.dbSystemId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.isEnabled = $.isEnabled;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChannelsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChannelsPlainArgs $;

        public Builder() {
            $ = new GetChannelsPlainArgs();
        }

        public Builder(GetChannelsPlainArgs defaults) {
            $ = new GetChannelsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelId The OCID of the Channel.
         * 
         * @return builder
         * 
         */
        public Builder channelId(@Nullable String channelId) {
            $.channelId = channelId;
            return this;
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param dbSystemId The DB System [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(@Nullable String dbSystemId) {
            $.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * @param displayName A filter to return only the resource matching the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetChannelsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetChannelsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isEnabled If true, returns only Channels that are enabled. If false, returns only Channels that are disabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param state The LifecycleState of the Channel.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetChannelsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
