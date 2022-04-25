// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.clouddeploy_v1.inputs.PipelineConditionResponse;
import com.pulumi.googlenative.clouddeploy_v1.inputs.SerialPipelineResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A `DeliveryPipeline` resource in the Google Cloud Deploy API. A `DeliveryPipeline` defines a pipeline through which a Skaffold configuration can progress.
 * 
 */
public final class DeliveryPipelineResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryPipelineResponse Empty = new DeliveryPipelineResponse();

    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Import(name="annotations", required=true)
    private Map<String,String> annotations;

    /**
     * @return User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }

    /**
     * Information around the state of the Delivery Pipeline.
     * 
     */
    @Import(name="condition", required=true)
    private PipelineConditionResponse condition;

    /**
     * @return Information around the state of the Delivery Pipeline.
     * 
     */
    public PipelineConditionResponse condition() {
        return this.condition;
    }

    /**
     * Time at which the pipeline was created.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    /**
     * @return Time at which the pipeline was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }

    /**
     * Description of the `DeliveryPipeline`. Max length is 255 characters.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return Description of the `DeliveryPipeline`. Max length is 255 characters.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    /**
     * @return Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * Optional. Name of the `DeliveryPipeline`. Format is projects/{project}/ locations/{location}/deliveryPipelines/a-z{0,62}.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Optional. Name of the `DeliveryPipeline`. Format is projects/{project}/ locations/{location}/deliveryPipelines/a-z{0,62}.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * 
     */
    @Import(name="serialPipeline", required=true)
    private SerialPipelineResponse serialPipeline;

    /**
     * @return SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * 
     */
    public SerialPipelineResponse serialPipeline() {
        return this.serialPipeline;
    }

    /**
     * Unique identifier of the `DeliveryPipeline`.
     * 
     */
    @Import(name="uid", required=true)
    private String uid;

    /**
     * @return Unique identifier of the `DeliveryPipeline`.
     * 
     */
    public String uid() {
        return this.uid;
    }

    /**
     * Most recent time at which the pipeline was updated.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    /**
     * @return Most recent time at which the pipeline was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    private DeliveryPipelineResponse() {}

    private DeliveryPipelineResponse(DeliveryPipelineResponse $) {
        this.annotations = $.annotations;
        this.condition = $.condition;
        this.createTime = $.createTime;
        this.description = $.description;
        this.etag = $.etag;
        this.labels = $.labels;
        this.name = $.name;
        this.serialPipeline = $.serialPipeline;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineResponse $;

        public Builder() {
            $ = new DeliveryPipelineResponse();
        }

        public Builder(DeliveryPipelineResponse defaults) {
            $ = new DeliveryPipelineResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param condition Information around the state of the Delivery Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder condition(PipelineConditionResponse condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param createTime Time at which the pipeline was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param description Description of the `DeliveryPipeline`. Max length is 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param etag This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param labels Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param name Optional. Name of the `DeliveryPipeline`. Format is projects/{project}/ locations/{location}/deliveryPipelines/a-z{0,62}.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param serialPipeline SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
         * 
         * @return builder
         * 
         */
        public Builder serialPipeline(SerialPipelineResponse serialPipeline) {
            $.serialPipeline = serialPipeline;
            return this;
        }

        /**
         * @param uid Unique identifier of the `DeliveryPipeline`.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param updateTime Most recent time at which the pipeline was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public DeliveryPipelineResponse build() {
            $.annotations = Objects.requireNonNull($.annotations, "expected parameter 'annotations' to be non-null");
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.serialPipeline = Objects.requireNonNull($.serialPipeline, "expected parameter 'serialPipeline' to be non-null");
            $.uid = Objects.requireNonNull($.uid, "expected parameter 'uid' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            return $;
        }
    }

}
