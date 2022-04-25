// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigateway_v1beta.enums.ApigatewayAuditLogConfigLogType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Provides the configuration for logging a type of permissions. Example: { &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34;, &#34;exempted_members&#34;: [ &#34;user:jose@example.com&#34; ] }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34; } ] } This enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class ApigatewayAuditLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApigatewayAuditLogConfigArgs Empty = new ApigatewayAuditLogConfigArgs();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @Import(name="exemptedMembers")
    private @Nullable Output<List<String>> exemptedMembers;

    /**
     * @return Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    public Optional<Output<List<String>>> exemptedMembers() {
        return Optional.ofNullable(this.exemptedMembers);
    }

    /**
     * The log type that this config enables.
     * 
     */
    @Import(name="logType")
    private @Nullable Output<ApigatewayAuditLogConfigLogType> logType;

    /**
     * @return The log type that this config enables.
     * 
     */
    public Optional<Output<ApigatewayAuditLogConfigLogType>> logType() {
        return Optional.ofNullable(this.logType);
    }

    private ApigatewayAuditLogConfigArgs() {}

    private ApigatewayAuditLogConfigArgs(ApigatewayAuditLogConfigArgs $) {
        this.exemptedMembers = $.exemptedMembers;
        this.logType = $.logType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApigatewayAuditLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayAuditLogConfigArgs $;

        public Builder() {
            $ = new ApigatewayAuditLogConfigArgs();
        }

        public Builder(ApigatewayAuditLogConfigArgs defaults) {
            $ = new ApigatewayAuditLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exemptedMembers Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
         * 
         * @return builder
         * 
         */
        public Builder exemptedMembers(@Nullable Output<List<String>> exemptedMembers) {
            $.exemptedMembers = exemptedMembers;
            return this;
        }

        /**
         * @param exemptedMembers Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
         * 
         * @return builder
         * 
         */
        public Builder exemptedMembers(List<String> exemptedMembers) {
            return exemptedMembers(Output.of(exemptedMembers));
        }

        /**
         * @param exemptedMembers Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
         * 
         * @return builder
         * 
         */
        public Builder exemptedMembers(String... exemptedMembers) {
            return exemptedMembers(List.of(exemptedMembers));
        }

        /**
         * @param logType The log type that this config enables.
         * 
         * @return builder
         * 
         */
        public Builder logType(@Nullable Output<ApigatewayAuditLogConfigLogType> logType) {
            $.logType = logType;
            return this;
        }

        /**
         * @param logType The log type that this config enables.
         * 
         * @return builder
         * 
         */
        public Builder logType(ApigatewayAuditLogConfigLogType logType) {
            return logType(Output.of(logType));
        }

        public ApigatewayAuditLogConfigArgs build() {
            return $;
        }
    }

}
