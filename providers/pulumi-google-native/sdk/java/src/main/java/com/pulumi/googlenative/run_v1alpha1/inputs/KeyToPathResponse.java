// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Maps a string key to a path within a volume.
 * 
 */
public final class KeyToPathResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyToPathResponse Empty = new KeyToPathResponse();

    /**
     * The Cloud Secret Manager secret version. Can be &#39;latest&#39; for the latest value or an integer for a specific version. The key to project.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The Cloud Secret Manager secret version. Can be &#39;latest&#39; for the latest value or an integer for a specific version. The key to project.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * (Optional) Mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume&#39;s default mode will be used. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="mode", required=true)
    private Integer mode;

    /**
     * @return (Optional) Mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume&#39;s default mode will be used. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Integer mode() {
        return this.mode;
    }

    /**
     * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return The relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
     * 
     */
    public String path() {
        return this.path;
    }

    private KeyToPathResponse() {}

    private KeyToPathResponse(KeyToPathResponse $) {
        this.key = $.key;
        this.mode = $.mode;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyToPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyToPathResponse $;

        public Builder() {
            $ = new KeyToPathResponse();
        }

        public Builder(KeyToPathResponse defaults) {
            $ = new KeyToPathResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The Cloud Secret Manager secret version. Can be &#39;latest&#39; for the latest value or an integer for a specific version. The key to project.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param mode (Optional) Mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume&#39;s default mode will be used. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder mode(Integer mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param path The relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public KeyToPathResponse build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
