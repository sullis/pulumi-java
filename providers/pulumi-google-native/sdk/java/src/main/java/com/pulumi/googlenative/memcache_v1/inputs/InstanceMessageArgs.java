// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.memcache_v1.enums.InstanceMessageCode;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMessageArgs Empty = new InstanceMessageArgs();

    /**
     * A code that correspond to one type of user-facing message.
     * 
     */
    @Import(name="code")
    private @Nullable Output<InstanceMessageCode> code;

    /**
     * @return A code that correspond to one type of user-facing message.
     * 
     */
    public Optional<Output<InstanceMessageCode>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Message on memcached instance which will be exposed to users.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Message on memcached instance which will be exposed to users.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    private InstanceMessageArgs() {}

    private InstanceMessageArgs(InstanceMessageArgs $) {
        this.code = $.code;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceMessageArgs $;

        public Builder() {
            $ = new InstanceMessageArgs();
        }

        public Builder(InstanceMessageArgs defaults) {
            $ = new InstanceMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code A code that correspond to one type of user-facing message.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<InstanceMessageCode> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code A code that correspond to one type of user-facing message.
         * 
         * @return builder
         * 
         */
        public Builder code(InstanceMessageCode code) {
            return code(Output.of(code));
        }

        /**
         * @param message Message on memcached instance which will be exposed to users.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Message on memcached instance which will be exposed to users.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        public InstanceMessageArgs build() {
            return $;
        }
    }

}
