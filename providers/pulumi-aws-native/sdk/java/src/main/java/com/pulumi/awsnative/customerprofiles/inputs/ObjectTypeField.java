// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.awsnative.customerprofiles.enums.ObjectTypeFieldContentType;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a field in a ProfileObjectType.
 * 
 */
public final class ObjectTypeField extends com.pulumi.resources.InvokeArgs {

    public static final ObjectTypeField Empty = new ObjectTypeField();

    /**
     * The content type of the field. Used for determining equality when searching.
     * 
     */
    @Import(name="contentType")
    private @Nullable ObjectTypeFieldContentType contentType;

    /**
     * @return The content type of the field. Used for determining equality when searching.
     * 
     */
    public Optional<ObjectTypeFieldContentType> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * A field of a ProfileObject. For example: _source.FirstName, where &#34;_source&#34; is a ProfileObjectType of a Zendesk user and &#34;FirstName&#34; is a field in that ObjectType.
     * 
     */
    @Import(name="source")
    private @Nullable String source;

    /**
     * @return A field of a ProfileObject. For example: _source.FirstName, where &#34;_source&#34; is a ProfileObjectType of a Zendesk user and &#34;FirstName&#34; is a field in that ObjectType.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * 
     */
    @Import(name="target")
    private @Nullable String target;

    /**
     * @return The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    private ObjectTypeField() {}

    private ObjectTypeField(ObjectTypeField $) {
        this.contentType = $.contentType;
        this.source = $.source;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectTypeField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectTypeField $;

        public Builder() {
            $ = new ObjectTypeField();
        }

        public Builder(ObjectTypeField defaults) {
            $ = new ObjectTypeField(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType The content type of the field. Used for determining equality when searching.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable ObjectTypeFieldContentType contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param source A field of a ProfileObject. For example: _source.FirstName, where &#34;_source&#34; is a ProfileObjectType of a Zendesk user and &#34;FirstName&#34; is a field in that ObjectType.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable String source) {
            $.source = source;
            return this;
        }

        /**
         * @param target The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable String target) {
            $.target = target;
            return this;
        }

        public ObjectTypeField build() {
            return $;
        }
    }

}
