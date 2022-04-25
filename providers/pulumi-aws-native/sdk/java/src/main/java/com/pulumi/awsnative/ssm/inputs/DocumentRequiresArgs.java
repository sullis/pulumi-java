// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentRequiresArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentRequiresArgs Empty = new DocumentRequiresArgs();

    /**
     * The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The document version required by the current document.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The document version required by the current document.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private DocumentRequiresArgs() {}

    private DocumentRequiresArgs(DocumentRequiresArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentRequiresArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentRequiresArgs $;

        public Builder() {
            $ = new DocumentRequiresArgs();
        }

        public Builder(DocumentRequiresArgs defaults) {
            $ = new DocumentRequiresArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version The document version required by the current document.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The document version required by the current document.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DocumentRequiresArgs build() {
            return $;
        }
    }

}
