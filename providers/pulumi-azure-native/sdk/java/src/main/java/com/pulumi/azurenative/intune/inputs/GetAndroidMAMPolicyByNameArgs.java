// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.intune.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAndroidMAMPolicyByNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAndroidMAMPolicyByNameArgs Empty = new GetAndroidMAMPolicyByNameArgs();

    /**
     * Location hostName for the tenant
     * 
     */
    @Import(name="hostName", required=true)
    private String hostName;

    /**
     * @return Location hostName for the tenant
     * 
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Unique name for the policy
     * 
     */
    @Import(name="policyName", required=true)
    private String policyName;

    /**
     * @return Unique name for the policy
     * 
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * select specific fields in entity.
     * 
     */
    @Import(name="select")
    private @Nullable String select;

    /**
     * @return select specific fields in entity.
     * 
     */
    public Optional<String> select() {
        return Optional.ofNullable(this.select);
    }

    private GetAndroidMAMPolicyByNameArgs() {}

    private GetAndroidMAMPolicyByNameArgs(GetAndroidMAMPolicyByNameArgs $) {
        this.hostName = $.hostName;
        this.policyName = $.policyName;
        this.select = $.select;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAndroidMAMPolicyByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAndroidMAMPolicyByNameArgs $;

        public Builder() {
            $ = new GetAndroidMAMPolicyByNameArgs();
        }

        public Builder(GetAndroidMAMPolicyByNameArgs defaults) {
            $ = new GetAndroidMAMPolicyByNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostName Location hostName for the tenant
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param policyName Unique name for the policy
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param select select specific fields in entity.
         * 
         * @return builder
         * 
         */
        public Builder select(@Nullable String select) {
            $.select = select;
            return this;
        }

        public GetAndroidMAMPolicyByNameArgs build() {
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            return $;
        }
    }

}
