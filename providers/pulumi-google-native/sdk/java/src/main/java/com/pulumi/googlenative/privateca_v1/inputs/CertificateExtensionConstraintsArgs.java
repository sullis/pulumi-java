// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1.enums.CertificateExtensionConstraintsKnownExtensionsItem;
import com.pulumi.googlenative.privateca_v1.inputs.ObjectIdArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a set of X.509 extensions that may be part of some certificate issuance controls.
 * 
 */
public final class CertificateExtensionConstraintsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateExtensionConstraintsArgs Empty = new CertificateExtensionConstraintsArgs();

    /**
     * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions")
    private @Nullable Output<List<ObjectIdArgs>> additionalExtensions;

    /**
     * @return Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
     * 
     */
    public Optional<Output<List<ObjectIdArgs>>> additionalExtensions() {
        return Optional.ofNullable(this.additionalExtensions);
    }

    /**
     * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
     * 
     */
    @Import(name="knownExtensions")
    private @Nullable Output<List<CertificateExtensionConstraintsKnownExtensionsItem>> knownExtensions;

    /**
     * @return Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
     * 
     */
    public Optional<Output<List<CertificateExtensionConstraintsKnownExtensionsItem>>> knownExtensions() {
        return Optional.ofNullable(this.knownExtensions);
    }

    private CertificateExtensionConstraintsArgs() {}

    private CertificateExtensionConstraintsArgs(CertificateExtensionConstraintsArgs $) {
        this.additionalExtensions = $.additionalExtensions;
        this.knownExtensions = $.knownExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateExtensionConstraintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateExtensionConstraintsArgs $;

        public Builder() {
            $ = new CertificateExtensionConstraintsArgs();
        }

        public Builder(CertificateExtensionConstraintsArgs defaults) {
            $ = new CertificateExtensionConstraintsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalExtensions Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(@Nullable Output<List<ObjectIdArgs>> additionalExtensions) {
            $.additionalExtensions = additionalExtensions;
            return this;
        }

        /**
         * @param additionalExtensions Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(List<ObjectIdArgs> additionalExtensions) {
            return additionalExtensions(Output.of(additionalExtensions));
        }

        /**
         * @param additionalExtensions Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(ObjectIdArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }

        /**
         * @param knownExtensions Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder knownExtensions(@Nullable Output<List<CertificateExtensionConstraintsKnownExtensionsItem>> knownExtensions) {
            $.knownExtensions = knownExtensions;
            return this;
        }

        /**
         * @param knownExtensions Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder knownExtensions(List<CertificateExtensionConstraintsKnownExtensionsItem> knownExtensions) {
            return knownExtensions(Output.of(knownExtensions));
        }

        /**
         * @param knownExtensions Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder knownExtensions(CertificateExtensionConstraintsKnownExtensionsItem... knownExtensions) {
            return knownExtensions(List.of(knownExtensions));
        }

        public CertificateExtensionConstraintsArgs build() {
            return $;
        }
    }

}
