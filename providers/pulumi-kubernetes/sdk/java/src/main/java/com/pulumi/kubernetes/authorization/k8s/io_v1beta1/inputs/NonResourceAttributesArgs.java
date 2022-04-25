// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authorization.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
 * 
 */
public final class NonResourceAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final NonResourceAttributesArgs Empty = new NonResourceAttributesArgs();

    /**
     * Path is the URL path of the request
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path is the URL path of the request
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Verb is the standard HTTP verb
     * 
     */
    @Import(name="verb")
    private @Nullable Output<String> verb;

    /**
     * @return Verb is the standard HTTP verb
     * 
     */
    public Optional<Output<String>> verb() {
        return Optional.ofNullable(this.verb);
    }

    private NonResourceAttributesArgs() {}

    private NonResourceAttributesArgs(NonResourceAttributesArgs $) {
        this.path = $.path;
        this.verb = $.verb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NonResourceAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NonResourceAttributesArgs $;

        public Builder() {
            $ = new NonResourceAttributesArgs();
        }

        public Builder(NonResourceAttributesArgs defaults) {
            $ = new NonResourceAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Path is the URL path of the request
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path is the URL path of the request
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param verb Verb is the standard HTTP verb
         * 
         * @return builder
         * 
         */
        public Builder verb(@Nullable Output<String> verb) {
            $.verb = verb;
            return this;
        }

        /**
         * @param verb Verb is the standard HTTP verb
         * 
         * @return builder
         * 
         */
        public Builder verb(String verb) {
            return verb(Output.of(verb));
        }

        public NonResourceAttributesArgs build() {
            return $;
        }
    }

}
