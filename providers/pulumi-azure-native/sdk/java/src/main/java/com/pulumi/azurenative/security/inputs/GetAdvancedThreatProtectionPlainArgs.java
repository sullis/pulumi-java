// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAdvancedThreatProtectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAdvancedThreatProtectionPlainArgs Empty = new GetAdvancedThreatProtectionPlainArgs();

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceId", required=true)
    private String resourceId;

    /**
     * @return The identifier of the resource.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Advanced Threat Protection setting name.
     * 
     */
    @Import(name="settingName", required=true)
    private String settingName;

    /**
     * @return Advanced Threat Protection setting name.
     * 
     */
    public String settingName() {
        return this.settingName;
    }

    private GetAdvancedThreatProtectionPlainArgs() {}

    private GetAdvancedThreatProtectionPlainArgs(GetAdvancedThreatProtectionPlainArgs $) {
        this.resourceId = $.resourceId;
        this.settingName = $.settingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAdvancedThreatProtectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAdvancedThreatProtectionPlainArgs $;

        public Builder() {
            $ = new GetAdvancedThreatProtectionPlainArgs();
        }

        public Builder(GetAdvancedThreatProtectionPlainArgs defaults) {
            $ = new GetAdvancedThreatProtectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param settingName Advanced Threat Protection setting name.
         * 
         * @return builder
         * 
         */
        public Builder settingName(String settingName) {
            $.settingName = settingName;
            return this;
        }

        public GetAdvancedThreatProtectionPlainArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.settingName = Objects.requireNonNull($.settingName, "expected parameter 'settingName' to be non-null");
            return $;
        }
    }

}
