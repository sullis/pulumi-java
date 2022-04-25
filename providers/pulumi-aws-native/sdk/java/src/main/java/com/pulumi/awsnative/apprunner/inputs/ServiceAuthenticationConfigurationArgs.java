// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication Configuration
 * 
 */
public final class ServiceAuthenticationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAuthenticationConfigurationArgs Empty = new ServiceAuthenticationConfigurationArgs();

    /**
     * Access Role Arn
     * 
     */
    @Import(name="accessRoleArn")
    private @Nullable Output<String> accessRoleArn;

    /**
     * @return Access Role Arn
     * 
     */
    public Optional<Output<String>> accessRoleArn() {
        return Optional.ofNullable(this.accessRoleArn);
    }

    /**
     * Connection Arn
     * 
     */
    @Import(name="connectionArn")
    private @Nullable Output<String> connectionArn;

    /**
     * @return Connection Arn
     * 
     */
    public Optional<Output<String>> connectionArn() {
        return Optional.ofNullable(this.connectionArn);
    }

    private ServiceAuthenticationConfigurationArgs() {}

    private ServiceAuthenticationConfigurationArgs(ServiceAuthenticationConfigurationArgs $) {
        this.accessRoleArn = $.accessRoleArn;
        this.connectionArn = $.connectionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAuthenticationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAuthenticationConfigurationArgs $;

        public Builder() {
            $ = new ServiceAuthenticationConfigurationArgs();
        }

        public Builder(ServiceAuthenticationConfigurationArgs defaults) {
            $ = new ServiceAuthenticationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessRoleArn Access Role Arn
         * 
         * @return builder
         * 
         */
        public Builder accessRoleArn(@Nullable Output<String> accessRoleArn) {
            $.accessRoleArn = accessRoleArn;
            return this;
        }

        /**
         * @param accessRoleArn Access Role Arn
         * 
         * @return builder
         * 
         */
        public Builder accessRoleArn(String accessRoleArn) {
            return accessRoleArn(Output.of(accessRoleArn));
        }

        /**
         * @param connectionArn Connection Arn
         * 
         * @return builder
         * 
         */
        public Builder connectionArn(@Nullable Output<String> connectionArn) {
            $.connectionArn = connectionArn;
            return this;
        }

        /**
         * @param connectionArn Connection Arn
         * 
         * @return builder
         * 
         */
        public Builder connectionArn(String connectionArn) {
            return connectionArn(Output.of(connectionArn));
        }

        public ServiceAuthenticationConfigurationArgs build() {
            return $;
        }
    }

}
