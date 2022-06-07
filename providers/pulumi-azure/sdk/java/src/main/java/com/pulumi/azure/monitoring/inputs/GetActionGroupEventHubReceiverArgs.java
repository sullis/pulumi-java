// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetActionGroupEventHubReceiverArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetActionGroupEventHubReceiverArgs Empty = new GetActionGroupEventHubReceiverArgs();

    /**
     * The resource ID of the respective Event Hub.
     * 
     */
    @Import(name="eventHubId", required=true)
    private Output<String> eventHubId;

    /**
     * @return The resource ID of the respective Event Hub.
     * 
     */
    public Output<String> eventHubId() {
        return this.eventHubId;
    }

    /**
     * Specifies the name of the Action Group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Tenant ID for the subscription containing this Event Hub.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return The Tenant ID for the subscription containing this Event Hub.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
    private @Nullable Output<Boolean> useCommonAlertSchema;

    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    public Optional<Output<Boolean>> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    private GetActionGroupEventHubReceiverArgs() {}

    private GetActionGroupEventHubReceiverArgs(GetActionGroupEventHubReceiverArgs $) {
        this.eventHubId = $.eventHubId;
        this.name = $.name;
        this.tenantId = $.tenantId;
        this.useCommonAlertSchema = $.useCommonAlertSchema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActionGroupEventHubReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActionGroupEventHubReceiverArgs $;

        public Builder() {
            $ = new GetActionGroupEventHubReceiverArgs();
        }

        public Builder(GetActionGroupEventHubReceiverArgs defaults) {
            $ = new GetActionGroupEventHubReceiverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventHubId The resource ID of the respective Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder eventHubId(Output<String> eventHubId) {
            $.eventHubId = eventHubId;
            return this;
        }

        /**
         * @param eventHubId The resource ID of the respective Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder eventHubId(String eventHubId) {
            return eventHubId(Output.of(eventHubId));
        }

        /**
         * @param name Specifies the name of the Action Group.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Action Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tenantId The Tenant ID for the subscription containing this Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID for the subscription containing this Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param useCommonAlertSchema Indicates whether to use common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(@Nullable Output<Boolean> useCommonAlertSchema) {
            $.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        /**
         * @param useCommonAlertSchema Indicates whether to use common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(Boolean useCommonAlertSchema) {
            return useCommonAlertSchema(Output.of(useCommonAlertSchema));
        }

        public GetActionGroupEventHubReceiverArgs build() {
            $.eventHubId = Objects.requireNonNull($.eventHubId, "expected parameter 'eventHubId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
