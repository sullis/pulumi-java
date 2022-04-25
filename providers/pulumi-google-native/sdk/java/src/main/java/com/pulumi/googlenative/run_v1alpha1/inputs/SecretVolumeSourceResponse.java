// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.KeyToPathResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The secret&#39;s value will be presented as the content of a file whose name is defined in the item path. If no items are defined, the name of the file is the secret_name. The contents of the target Secret&#39;s Data field will be presented in a volume as files using the keys in the Data field as the file names.
 * 
 */
public final class SecretVolumeSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecretVolumeSourceResponse Empty = new SecretVolumeSourceResponse();

    /**
     * Integer representation of mode bits to use on created files by default. Must be a value between 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="defaultMode", required=true)
    private Integer defaultMode;

    /**
     * @return Integer representation of mode bits to use on created files by default. Must be a value between 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Integer defaultMode() {
        return this.defaultMode;
    }

    /**
     * (Optional) If unspecified, the volume will expose a file whose name is the secret_name. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a key and a path. If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
     * 
     */
    @Import(name="items", required=true)
    private List<KeyToPathResponse> items;

    /**
     * @return (Optional) If unspecified, the volume will expose a file whose name is the secret_name. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a key and a path. If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
     * 
     */
    public List<KeyToPathResponse> items() {
        return this.items;
    }

    /**
     * (Optional) Specify whether the Secret or its keys must be defined.
     * 
     */
    @Import(name="optional", required=true)
    private Boolean optional;

    /**
     * @return (Optional) Specify whether the Secret or its keys must be defined.
     * 
     */
    public Boolean optional() {
        return this.optional;
    }

    /**
     * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. Name of the secret in the container&#39;s namespace to use.
     * 
     */
    @Import(name="secretName", required=true)
    private String secretName;

    /**
     * @return The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. Name of the secret in the container&#39;s namespace to use.
     * 
     */
    public String secretName() {
        return this.secretName;
    }

    private SecretVolumeSourceResponse() {}

    private SecretVolumeSourceResponse(SecretVolumeSourceResponse $) {
        this.defaultMode = $.defaultMode;
        this.items = $.items;
        this.optional = $.optional;
        this.secretName = $.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretVolumeSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretVolumeSourceResponse $;

        public Builder() {
            $ = new SecretVolumeSourceResponse();
        }

        public Builder(SecretVolumeSourceResponse defaults) {
            $ = new SecretVolumeSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultMode Integer representation of mode bits to use on created files by default. Must be a value between 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder defaultMode(Integer defaultMode) {
            $.defaultMode = defaultMode;
            return this;
        }

        /**
         * @param items (Optional) If unspecified, the volume will expose a file whose name is the secret_name. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a key and a path. If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
         * 
         * @return builder
         * 
         */
        public Builder items(List<KeyToPathResponse> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items (Optional) If unspecified, the volume will expose a file whose name is the secret_name. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a key and a path. If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
         * 
         * @return builder
         * 
         */
        public Builder items(KeyToPathResponse... items) {
            return items(List.of(items));
        }

        /**
         * @param optional (Optional) Specify whether the Secret or its keys must be defined.
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param secretName The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. Name of the secret in the container&#39;s namespace to use.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            $.secretName = secretName;
            return this;
        }

        public SecretVolumeSourceResponse build() {
            $.defaultMode = Objects.requireNonNull($.defaultMode, "expected parameter 'defaultMode' to be non-null");
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            $.optional = Objects.requireNonNull($.optional, "expected parameter 'optional' to be non-null");
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            return $;
        }
    }

}
