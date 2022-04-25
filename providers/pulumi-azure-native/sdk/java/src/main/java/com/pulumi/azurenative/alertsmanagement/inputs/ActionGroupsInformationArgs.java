// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Action Groups information, used by the alert rule.
 * 
 */
public final class ActionGroupsInformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionGroupsInformationArgs Empty = new ActionGroupsInformationArgs();

    /**
     * An optional custom email subject to use in email notifications.
     * 
     */
    @Import(name="customEmailSubject")
    private @Nullable Output<String> customEmailSubject;

    /**
     * @return An optional custom email subject to use in email notifications.
     * 
     */
    public Optional<Output<String>> customEmailSubject() {
        return Optional.ofNullable(this.customEmailSubject);
    }

    /**
     * An optional custom web-hook payload to use in web-hook notifications.
     * 
     */
    @Import(name="customWebhookPayload")
    private @Nullable Output<String> customWebhookPayload;

    /**
     * @return An optional custom web-hook payload to use in web-hook notifications.
     * 
     */
    public Optional<Output<String>> customWebhookPayload() {
        return Optional.ofNullable(this.customWebhookPayload);
    }

    /**
     * The Action Group resource IDs.
     * 
     */
    @Import(name="groupIds", required=true)
    private Output<List<String>> groupIds;

    /**
     * @return The Action Group resource IDs.
     * 
     */
    public Output<List<String>> groupIds() {
        return this.groupIds;
    }

    private ActionGroupsInformationArgs() {}

    private ActionGroupsInformationArgs(ActionGroupsInformationArgs $) {
        this.customEmailSubject = $.customEmailSubject;
        this.customWebhookPayload = $.customWebhookPayload;
        this.groupIds = $.groupIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionGroupsInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupsInformationArgs $;

        public Builder() {
            $ = new ActionGroupsInformationArgs();
        }

        public Builder(ActionGroupsInformationArgs defaults) {
            $ = new ActionGroupsInformationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customEmailSubject An optional custom email subject to use in email notifications.
         * 
         * @return builder
         * 
         */
        public Builder customEmailSubject(@Nullable Output<String> customEmailSubject) {
            $.customEmailSubject = customEmailSubject;
            return this;
        }

        /**
         * @param customEmailSubject An optional custom email subject to use in email notifications.
         * 
         * @return builder
         * 
         */
        public Builder customEmailSubject(String customEmailSubject) {
            return customEmailSubject(Output.of(customEmailSubject));
        }

        /**
         * @param customWebhookPayload An optional custom web-hook payload to use in web-hook notifications.
         * 
         * @return builder
         * 
         */
        public Builder customWebhookPayload(@Nullable Output<String> customWebhookPayload) {
            $.customWebhookPayload = customWebhookPayload;
            return this;
        }

        /**
         * @param customWebhookPayload An optional custom web-hook payload to use in web-hook notifications.
         * 
         * @return builder
         * 
         */
        public Builder customWebhookPayload(String customWebhookPayload) {
            return customWebhookPayload(Output.of(customWebhookPayload));
        }

        /**
         * @param groupIds The Action Group resource IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(Output<List<String>> groupIds) {
            $.groupIds = groupIds;
            return this;
        }

        /**
         * @param groupIds The Action Group resource IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(List<String> groupIds) {
            return groupIds(Output.of(groupIds));
        }

        /**
         * @param groupIds The Action Group resource IDs.
         * 
         * @return builder
         * 
         */
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }

        public ActionGroupsInformationArgs build() {
            $.groupIds = Objects.requireNonNull($.groupIds, "expected parameter 'groupIds' to be non-null");
            return $;
        }
    }

}
