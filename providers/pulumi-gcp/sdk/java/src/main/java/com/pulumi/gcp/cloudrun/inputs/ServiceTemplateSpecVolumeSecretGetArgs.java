// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeSecretItemGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecVolumeSecretGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecVolumeSecretGetArgs Empty = new ServiceTemplateSpecVolumeSecretGetArgs();

    /**
     * Mode bits to use on created files by default. Must be a value between 0000
     * and 0777. Defaults to 0644. Directories within the path are not affected by
     * this setting. This might be in conflict with other options that affect the
     * file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="defaultMode")
    private @Nullable Output<Integer> defaultMode;

    /**
     * @return Mode bits to use on created files by default. Must be a value between 0000
     * and 0777. Defaults to 0644. Directories within the path are not affected by
     * this setting. This might be in conflict with other options that affect the
     * file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Output<Integer>> defaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }

    /**
     * If unspecified, the volume will expose a file whose name is the
     * secret_name.
     * If specified, the key will be used as the version to fetch from Cloud
     * Secret Manager and the path will be the name of the file exposed in the
     * volume. When items are defined, they must specify a key and a path.
     * Structure is documented below.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<ServiceTemplateSpecVolumeSecretItemGetArgs>> items;

    /**
     * @return If unspecified, the volume will expose a file whose name is the
     * secret_name.
     * If specified, the key will be used as the version to fetch from Cloud
     * Secret Manager and the path will be the name of the file exposed in the
     * volume. When items are defined, they must specify a key and a path.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServiceTemplateSpecVolumeSecretItemGetArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * The name of the secret in Cloud Secret Manager. By default, the secret
     * is assumed to be in the same project.
     * If the secret is in another project, you must define an alias.
     * An alias definition has the form:
     * &lt;alias&gt;:projects/&lt;project-id|project-number&gt;/secrets/&lt;secret-name&gt;.
     * If multiple alias definitions are needed, they must be separated by
     * commas.
     * The alias definitions must be set on the run.googleapis.com/secrets
     * annotation.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return The name of the secret in Cloud Secret Manager. By default, the secret
     * is assumed to be in the same project.
     * If the secret is in another project, you must define an alias.
     * An alias definition has the form:
     * &lt;alias&gt;:projects/&lt;project-id|project-number&gt;/secrets/&lt;secret-name&gt;.
     * If multiple alias definitions are needed, they must be separated by
     * commas.
     * The alias definitions must be set on the run.googleapis.com/secrets
     * annotation.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    private ServiceTemplateSpecVolumeSecretGetArgs() {}

    private ServiceTemplateSpecVolumeSecretGetArgs(ServiceTemplateSpecVolumeSecretGetArgs $) {
        this.defaultMode = $.defaultMode;
        this.items = $.items;
        this.secretName = $.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateSpecVolumeSecretGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateSpecVolumeSecretGetArgs $;

        public Builder() {
            $ = new ServiceTemplateSpecVolumeSecretGetArgs();
        }

        public Builder(ServiceTemplateSpecVolumeSecretGetArgs defaults) {
            $ = new ServiceTemplateSpecVolumeSecretGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultMode Mode bits to use on created files by default. Must be a value between 0000
         * and 0777. Defaults to 0644. Directories within the path are not affected by
         * this setting. This might be in conflict with other options that affect the
         * file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder defaultMode(@Nullable Output<Integer> defaultMode) {
            $.defaultMode = defaultMode;
            return this;
        }

        /**
         * @param defaultMode Mode bits to use on created files by default. Must be a value between 0000
         * and 0777. Defaults to 0644. Directories within the path are not affected by
         * this setting. This might be in conflict with other options that affect the
         * file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder defaultMode(Integer defaultMode) {
            return defaultMode(Output.of(defaultMode));
        }

        /**
         * @param items If unspecified, the volume will expose a file whose name is the
         * secret_name.
         * If specified, the key will be used as the version to fetch from Cloud
         * Secret Manager and the path will be the name of the file exposed in the
         * volume. When items are defined, they must specify a key and a path.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<ServiceTemplateSpecVolumeSecretItemGetArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items If unspecified, the volume will expose a file whose name is the
         * secret_name.
         * If specified, the key will be used as the version to fetch from Cloud
         * Secret Manager and the path will be the name of the file exposed in the
         * volume. When items are defined, they must specify a key and a path.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder items(List<ServiceTemplateSpecVolumeSecretItemGetArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items If unspecified, the volume will expose a file whose name is the
         * secret_name.
         * If specified, the key will be used as the version to fetch from Cloud
         * Secret Manager and the path will be the name of the file exposed in the
         * volume. When items are defined, they must specify a key and a path.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder items(ServiceTemplateSpecVolumeSecretItemGetArgs... items) {
            return items(List.of(items));
        }

        /**
         * @param secretName The name of the secret in Cloud Secret Manager. By default, the secret
         * is assumed to be in the same project.
         * If the secret is in another project, you must define an alias.
         * An alias definition has the form:
         * &lt;alias&gt;:projects/&lt;project-id|project-number&gt;/secrets/&lt;secret-name&gt;.
         * If multiple alias definitions are needed, they must be separated by
         * commas.
         * The alias definitions must be set on the run.googleapis.com/secrets
         * annotation.
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName The name of the secret in Cloud Secret Manager. By default, the secret
         * is assumed to be in the same project.
         * If the secret is in another project, you must define an alias.
         * An alias definition has the form:
         * &lt;alias&gt;:projects/&lt;project-id|project-number&gt;/secrets/&lt;secret-name&gt;.
         * If multiple alias definitions are needed, they must be separated by
         * commas.
         * The alias definitions must be set on the run.googleapis.com/secrets
         * annotation.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        public ServiceTemplateSpecVolumeSecretGetArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            return $;
        }
    }

}
