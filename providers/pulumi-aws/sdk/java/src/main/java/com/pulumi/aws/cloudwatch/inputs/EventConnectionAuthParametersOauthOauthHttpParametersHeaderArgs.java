// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs Empty = new EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs();

    /**
     * Specified whether the value is secret.
     * 
     */
    @Import(name="isValueSecret")
    private @Nullable Output<Boolean> isValueSecret;

    /**
     * @return Specified whether the value is secret.
     * 
     */
    public Optional<Output<Boolean>> isValueSecret() {
        return Optional.ofNullable(this.isValueSecret);
    }

    /**
     * Header Name.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Header Name.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs() {}

    private EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs(EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs $) {
        this.isValueSecret = $.isValueSecret;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs $;

        public Builder() {
            $ = new EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs();
        }

        public Builder(EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs defaults) {
            $ = new EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isValueSecret Specified whether the value is secret.
         * 
         * @return builder
         * 
         */
        public Builder isValueSecret(@Nullable Output<Boolean> isValueSecret) {
            $.isValueSecret = isValueSecret;
            return this;
        }

        /**
         * @param isValueSecret Specified whether the value is secret.
         * 
         * @return builder
         * 
         */
        public Builder isValueSecret(Boolean isValueSecret) {
            return isValueSecret(Output.of(isValueSecret));
        }

        /**
         * @param key Header Name.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Header Name.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Header Value. Created and stored in AWS Secrets Manager.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Header Value. Created and stored in AWS Secrets Manager.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs build() {
            return $;
        }
    }

}
