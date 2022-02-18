// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DataSourceConfluencePageFieldName {
        Author("AUTHOR"),
        ContentStatus("CONTENT_STATUS"),
        CreatedDate("CREATED_DATE"),
        DisplayUrl("DISPLAY_URL"),
        ItemType("ITEM_TYPE"),
        Labels("LABELS"),
        ModifiedDate("MODIFIED_DATE"),
        ParentId("PARENT_ID"),
        SpaceKey("SPACE_KEY"),
        SpaceName("SPACE_NAME"),
        Url("URL"),
        Version("VERSION");

        private final String value;

        DataSourceConfluencePageFieldName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataSourceConfluencePageFieldName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
