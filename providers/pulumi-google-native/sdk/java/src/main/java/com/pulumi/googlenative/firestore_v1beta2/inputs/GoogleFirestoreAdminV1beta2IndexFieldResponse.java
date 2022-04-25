// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A field in an index. The field_path describes which field is indexed, the value_mode describes how the field value is indexed.
 * 
 */
public final class GoogleFirestoreAdminV1beta2IndexFieldResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleFirestoreAdminV1beta2IndexFieldResponse Empty = new GoogleFirestoreAdminV1beta2IndexFieldResponse();

    /**
     * Indicates that this field supports operations on `array_value`s.
     * 
     */
    @Import(name="arrayConfig", required=true)
    private String arrayConfig;

    /**
     * @return Indicates that this field supports operations on `array_value`s.
     * 
     */
    public String arrayConfig() {
        return this.arrayConfig;
    }

    /**
     * Can be __name__. For single field indexes, this must match the name of the field or may be omitted.
     * 
     */
    @Import(name="fieldPath", required=true)
    private String fieldPath;

    /**
     * @return Can be __name__. For single field indexes, this must match the name of the field or may be omitted.
     * 
     */
    public String fieldPath() {
        return this.fieldPath;
    }

    /**
     * Indicates that this field supports ordering by the specified order or comparing using =, &lt;, &lt;=, &gt;, &gt;=.
     * 
     */
    @Import(name="order", required=true)
    private String order;

    /**
     * @return Indicates that this field supports ordering by the specified order or comparing using =, &lt;, &lt;=, &gt;, &gt;=.
     * 
     */
    public String order() {
        return this.order;
    }

    private GoogleFirestoreAdminV1beta2IndexFieldResponse() {}

    private GoogleFirestoreAdminV1beta2IndexFieldResponse(GoogleFirestoreAdminV1beta2IndexFieldResponse $) {
        this.arrayConfig = $.arrayConfig;
        this.fieldPath = $.fieldPath;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleFirestoreAdminV1beta2IndexFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleFirestoreAdminV1beta2IndexFieldResponse $;

        public Builder() {
            $ = new GoogleFirestoreAdminV1beta2IndexFieldResponse();
        }

        public Builder(GoogleFirestoreAdminV1beta2IndexFieldResponse defaults) {
            $ = new GoogleFirestoreAdminV1beta2IndexFieldResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param arrayConfig Indicates that this field supports operations on `array_value`s.
         * 
         * @return builder
         * 
         */
        public Builder arrayConfig(String arrayConfig) {
            $.arrayConfig = arrayConfig;
            return this;
        }

        /**
         * @param fieldPath Can be __name__. For single field indexes, this must match the name of the field or may be omitted.
         * 
         * @return builder
         * 
         */
        public Builder fieldPath(String fieldPath) {
            $.fieldPath = fieldPath;
            return this;
        }

        /**
         * @param order Indicates that this field supports ordering by the specified order or comparing using =, &lt;, &lt;=, &gt;, &gt;=.
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            $.order = order;
            return this;
        }

        public GoogleFirestoreAdminV1beta2IndexFieldResponse build() {
            $.arrayConfig = Objects.requireNonNull($.arrayConfig, "expected parameter 'arrayConfig' to be non-null");
            $.fieldPath = Objects.requireNonNull($.fieldPath, "expected parameter 'fieldPath' to be non-null");
            $.order = Objects.requireNonNull($.order, "expected parameter 'order' to be non-null");
            return $;
        }
    }

}
